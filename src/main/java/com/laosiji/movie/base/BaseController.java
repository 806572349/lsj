package com.laosiji.movie.base;

import com.laosiji.movie.entity.IHeadInfo;
import com.laosiji.movie.model.HeadInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseController {
    /**
     * @param isSuccess 成功的结果
     * @return
     */
    public ModelMap getMap(boolean isSuccess) {
        ModelMap map = new ModelMap();
        if (isSuccess) {
            map.put("code", 0);
            map.put("msg", "Success");
            return map;
        } else {
            map.put("code", 0);
            map.put("msg", "Fail");
            return map;
        }

    }

    public ModelMap getFileMap(boolean isSuccess, String Msg) {
        ModelMap map = new ModelMap();
        map.put("code", 1);
        map.put("msg", Msg);
        return map;

    }


    @Autowired
    IHeadInfo iHeadInfo;

    public List<HeadInfo> getHeadList() {
//        HeadInfo headInfo=new HeadInfo();
//        headInfo.setInfoName("齐天大圣孙悟空");
//        headInfo.setInfoImgUrl("http://img1.gtimg.com/v/pics/hv1/75/32/2249/146249460.jpg");
//        iHeadInfo.insert(headInfo);
//        HeadInfo headInfo2=new HeadInfo();
//        headInfo2.setInfoName("天蓬元帅猪八戒");
//        headInfo2.setInfoImgUrl("http://puui.qpic.cn/tv/0/16300838_1680580/0");
//        iHeadInfo.insert(headInfo2);
        ArrayList<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        List<HeadInfo> iHeadInfoAll = iHeadInfo.findAll();
        return iHeadInfoAll;


    }


}
