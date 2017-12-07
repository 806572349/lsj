package com.laosiji.movie.model;

import java.util.List;
import java.util.Map;
import org.springframework.data.annotation.Id;
public class MovieInfo {
        @Id
        String _id;
        String movieImgSrc;
        String damovieNametes;
        String movieIntroduction;
        List<String> movieSource;
        String movieGrade;
        String movieOtherName;
        String movieDirector;
        String movieRole;
        String movieType;
        String movieArea;
        String movieLanguage;
        String movieReleaseDate;
        String movieUpdateTime;
        String movieName;
        String type;

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getMovieName() {
                return movieName;
        }

        public void setMovieName(String movieName) {
                this.movieName = movieName;
        }

        public String get_id() {
                return _id;
        }

        public void set_id(String _id) {
                this._id = _id;
        }

        public String getMovieImgSrc() {
                return movieImgSrc;
        }

        public void setMovieImgSrc(String movieImgSrc) {
                this.movieImgSrc = movieImgSrc;
        }

        public String getDamovieNametes() {
                return damovieNametes;
        }

        public void setDamovieNametes(String damovieNametes) {
                this.damovieNametes = damovieNametes;
        }

        public String getMovieIntroduction() {
                return movieIntroduction;
        }

        public void setMovieIntroduction(String movieIntroduction) {
                this.movieIntroduction = movieIntroduction;
        }

        public List<String> getMovieSource() {
                return movieSource;
        }

        public void setMovieSource(List<String> movieSource) {
                this.movieSource = movieSource;
        }

        public String getMovieGrade() {
                return movieGrade;
        }

        public void setMovieGrade(String movieGrade) {
                this.movieGrade = movieGrade;
        }

        public String getMovieOtherName() {
                return movieOtherName;
        }

        public void setMovieOtherName(String movieOtherName) {
                this.movieOtherName = movieOtherName;
        }

        public String getMovieDirector() {
                return movieDirector;
        }

        public void setMovieDirector(String movieDirector) {
                this.movieDirector = movieDirector;
        }

        public String getMovieRole() {
                return movieRole;
        }

        public void setMovieRole(String movieRole) {
                this.movieRole = movieRole;
        }

        public String getMovieType() {
                return movieType;
        }

        public void setMovieType(String movieType) {
                this.movieType = movieType;
        }

        public String getMovieArea() {
                return movieArea;
        }

        public void setMovieArea(String movieArea) {
                this.movieArea = movieArea;
        }

        public String getMovieLanguage() {
                return movieLanguage;
        }

        public void setMovieLanguage(String movieLanguage) {
                this.movieLanguage = movieLanguage;
        }

        public String getMovieReleaseDate() {
                return movieReleaseDate;
        }

        public void setMovieReleaseDate(String movieReleaseDate) {
                this.movieReleaseDate = movieReleaseDate;
        }

        public String getMovieUpdateTime() {
                return movieUpdateTime;
        }

        public void setMovieUpdateTime(String movieUpdateTime) {
                this.movieUpdateTime = movieUpdateTime;
        }


        @Override
        public String toString() {
                return "MovieInfo{" +
                        "_id='" + _id + '\'' +
                        ", movieImgSrc='" + movieImgSrc + '\'' +
                        ", damovieNametes='" + damovieNametes + '\'' +
                        ", movieIntroduction='" + movieIntroduction + '\'' +
                        ", movieSource=" + movieSource +
                        ", movieGrade='" + movieGrade + '\'' +
                        ", movieOtherName='" + movieOtherName + '\'' +
                        ", movieDirector='" + movieDirector + '\'' +
                        ", movieRole='" + movieRole + '\'' +
                        ", movieType='" + movieType + '\'' +
                        ", movieArea='" + movieArea + '\'' +
                        ", movieLanguage='" + movieLanguage + '\'' +
                        ", movieReleaseDate='" + movieReleaseDate + '\'' +
                        ", movieUpdateTime='" + movieUpdateTime + '\'' +
                        '}';
        }
}
