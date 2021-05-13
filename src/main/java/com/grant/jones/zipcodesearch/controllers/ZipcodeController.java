package com.grant.jones.zipcodesearch.controllers;

import com.grant.jones.zipcodesearch.exceptions.ZipcodeNotFoundException;
import com.grant.jones.zipcodesearch.models.FullZipcode;
import com.grant.jones.zipcodesearch.models.Zipcode;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    @RestController
    @RequestMapping("/api")
    public class ZipcodeController {
        private static Map<String, Zipcode> zipCodeMap = new HashMap<>();

        static {
            Map<String, String> mapping = new HashMap<String, String>();

            mapping.put("RecordNumber", "recordNumber");
            mapping.put("Zipcode", "zipcode");
            mapping.put("ZipCodeType", "zipCodeType");
            mapping.put("City", "city");
            mapping.put("State", "state");
            mapping.put("LocationType", "locationType");
            mapping.put("Lat", "latitude");
            mapping.put("Long", "longitude");
            mapping.put("Xaxis", "xaxis");
            mapping.put("Yaxis", "yaxis");
            mapping.put("Zaxis", "zaxis");
            mapping.put("WorldRegion", "worldRegion");
            mapping.put("Country", "country");
            mapping.put("LocationText", "locationText");
            mapping.put("Location", "location");
            mapping.put("Decommisioned", "decommisioned");
            mapping.put("TaxReturnsFiled", "taxReturnsFiled");
            mapping.put("EstimatedPopulation", "estimatedPopulation");
            mapping.put("TotalWages", "totalWages");
            mapping.put("Notes", "notes");

            HeaderColumnNameTranslateMappingStrategy<FullZipcode> strategy = new HeaderColumnNameTranslateMappingStrategy<FullZipcode>();
            strategy.setType(FullZipcode.class);
            strategy.setColumnMapping(mapping);

            CSVReader csvReader = null;
            try (InputStream is = ZipcodeController.class.getResourceAsStream("/free-zipcode-database.csv");
                 Reader reader = new InputStreamReader(is)) {
                csvReader = new CSVReader(reader);
                @SuppressWarnings("rawtypes")
                CsvToBean csvToBean = new CsvToBean();
                @SuppressWarnings("deprecation")
                List<FullZipcode> list = csvToBean.parse(strategy, csvReader);


                for (FullZipcode e : list) {
                    boolean first = true;
                    Zipcode model = zipCodeMap.get(e.getZipcode());
                    if (model != null) {
                        first = false;
                    } else {
                        model = new Zipcode();
                    }
                    zipCodeMap.put(e.getZipcode(), model);

                    if (first) {
                        model.setPrimaryCity(e.getCity());
                    }

                    model.setState(e.getState());
                    model.setZipcode(e.getZipcode());
                    model.getCities().add(e.getCity());
                }
                System.out.println("Finished building zip code map");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @GetMapping("/zipcode")
        //@Transactional(timeout = 600000)
        public Zipcode zipcodeLookup(@RequestBody Zipcode input) {
            if (zipCodeMap.containsKey(input.getZipcode())){
                return zipCodeMap.get(input.getZipcode());
            }else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Zipcode not found or is invalid syntax",
                        new ZipcodeNotFoundException());
            }
        }



}
