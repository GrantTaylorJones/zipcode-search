package com.grant.jones.zipcodesearch.models;

import java.util.ArrayList;
import java.util.List;

public class Zipcode {

        private String zipcode, primaryCity, state;

        List<String> cities = new ArrayList<>();

        public Zipcode() {

        }




        public Zipcode(String zipcode, String primaryCity, String state, List<String> cities) {
            this.zipcode = zipcode;
            this.primaryCity = primaryCity;
            this.state = state;
            this.cities = cities;
        }




        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }




        public String getPrimaryCity() {
            return primaryCity;
        }




        public void setPrimaryCity(String primaryCity) {
            this.primaryCity = primaryCity;
        }




        public List<String> getCities() {
            return cities;
        }




        public void setCities(List<String> cities) {
            this.cities = cities;
        }




        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }




        @Override
        public String toString() {
            return "ZipCodeModel [zipcode=" + zipcode + ", primaryCity=" + primaryCity + ", state=" + state + ", cities="
                    + cities + "]";
        }






}
