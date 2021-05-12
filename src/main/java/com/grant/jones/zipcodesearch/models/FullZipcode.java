package com.grant.jones.zipcodesearch.models;


import com.opencsv.bean.CsvBindByName;

public class FullZipcode {


    //not being returned to any requests, just used to read the zip code csv file into an object

        @CsvBindByName(column = "RecordNumber")
        private String recordNumber;

        @CsvBindByName(column = "Zipcode")
        private String zipcode;

        @CsvBindByName(column = "ZipCodeType")
        private String zipCodeType;

        @CsvBindByName(column = "City")
        private String city;

        @CsvBindByName(column = "State")
        private String state;

        @CsvBindByName(column = "LocationType")
        private String locationType;

        @CsvBindByName(column = "Latitude")
        private String latitude;

        @CsvBindByName(column = "Longitude")
        private String longitude;

        @CsvBindByName(column = "Xaxis")
        private String xaxis;

        @CsvBindByName(column = "Yaxis")
        private String yaxis;

        @CsvBindByName(column = "Zaxis")
        private String zaxis;

        @CsvBindByName(column = "WorldRegion")
        private String worldRegion;

        @CsvBindByName(column = "Country")
        private String country;

        @CsvBindByName(column = "LocationText")
        private String locationText;

        @CsvBindByName(column = "Location")
        private String location;

        @CsvBindByName(column = "Decommisioned")
        private String decommisioned;

        @CsvBindByName(column = "TaxReturnsFiled")
        private String taxReturnsFiled;

        @CsvBindByName(column = "EstimatedPopulation")
        private String estimatedPopulation;

        @CsvBindByName(column = "TotalWages")
        private String totalWages;

        @CsvBindByName(column = "Notes")
        private String notes;


        public FullZipcode() {

        }


        public FullZipcode(String recordNumber, String zipcode, String zipCodeType, String city, String state,
                                String locationType, String latitude, String longitude, String xaxis, String yaxis, String zaxis,
                                String worldRegion, String country, String locationText, String location, String decommisioned,
                                String taxReturnsFiled, String estimatedPopulation, String totalWages, String notes) {
            this.recordNumber = recordNumber;
            this.zipcode = zipcode;
            this.zipCodeType = zipCodeType;
            this.city = city;
            this.state = state;
            this.locationType = locationType;
            this.latitude = latitude;
            this.longitude = longitude;
            this.xaxis = xaxis;
            this.yaxis = yaxis;
            this.zaxis = zaxis;
            this.worldRegion = worldRegion;
            this.country = country;
            this.locationText = locationText;
            this.location = location;
            this.decommisioned = decommisioned;
            this.taxReturnsFiled = taxReturnsFiled;
            this.estimatedPopulation = estimatedPopulation;
            this.totalWages = totalWages;
            this.notes = notes;
        }


        public String getRecordNumber() {
            return recordNumber;
        }


        public void setRecordNumber(String recordNumber) {
            this.recordNumber = recordNumber;
        }


        public String getZipcode() {
            return zipcode;
        }


        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }


        public String getZipCodeType() {
            return zipCodeType;
        }


        public void setZipCodeType(String zipCodeType) {
            this.zipCodeType = zipCodeType;
        }


        public String getCity() {
            return city;
        }


        public void setCity(String city) {
            this.city = city;
        }


        public String getState() {
            return state;
        }


        public void setState(String state) {
            this.state = state;
        }


        public String getLocationType() {
            return locationType;
        }


        public void setLocationType(String locationType) {
            this.locationType = locationType;
        }


        public String getLatitude() {
            return latitude;
        }


        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }


        public String getLongitude() {
            return longitude;
        }


        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }


        public String getXaxis() {
            return xaxis;
        }


        public void setXaxis(String xaxis) {
            this.xaxis = xaxis;
        }


        public String getYaxis() {
            return yaxis;
        }


        public void setYaxis(String yaxis) {
            this.yaxis = yaxis;
        }


        public String getZaxis() {
            return zaxis;
        }


        public void setZaxis(String zaxis) {
            this.zaxis = zaxis;
        }


        public String getWorldRegion() {
            return worldRegion;
        }


        public void setWorldRegion(String worldRegion) {
            this.worldRegion = worldRegion;
        }


        public String getCountry() {
            return country;
        }


        public void setCountry(String country) {
            this.country = country;
        }


        public String getLocationText() {
            return locationText;
        }


        public void setLocationText(String locationText) {
            this.locationText = locationText;
        }


        public String getLocation() {
            return location;
        }


        public void setLocation(String location) {
            this.location = location;
        }


        public String isDecommisioned() {
            return decommisioned;
        }


        public void setDecommisioned(String decommisioned) {
            this.decommisioned = decommisioned;
        }


        public String getTaxReturnsFiled() {
            return taxReturnsFiled;
        }


        public void setTaxReturnsFiled(String taxReturnsFiled) {
            this.taxReturnsFiled = taxReturnsFiled;
        }


        public String getEstimatedPopulation() {
            return estimatedPopulation;
        }


        public void setEstimatedPopulation(String estimatedPopulation) {
            this.estimatedPopulation = estimatedPopulation;
        }


        public String getTotalWages() {
            return totalWages;
        }


        public void setTotalWages(String totalWages) {
            this.totalWages = totalWages;
        }


        public String getNotes() {
            return notes;
        }


        public void setNotes(String notes) {
            this.notes = notes;
        }


        @Override
        public String toString() {
            return "FullZipCodeModel [recordNumber=" + recordNumber + ", zipcode=" + zipcode + ", zipCodeType="
                    + zipCodeType + ", city=" + city + ", state=" + state + ", locationType=" + locationType + ", latitude="
                    + latitude + ", longitude=" + longitude + ", xaxis=" + xaxis + ", yaxis=" + yaxis + ", zaxis=" + zaxis
                    + ", worldRegion=" + worldRegion + ", country=" + country + ", locationText=" + locationText
                    + ", location=" + location + ", decommisioned=" + decommisioned + ", taxReturnsFiled=" + taxReturnsFiled
                    + ", estimatedPopulation=" + estimatedPopulation + ", totalWages=" + totalWages + ", notes=" + notes
                    + "]";
        }






}
