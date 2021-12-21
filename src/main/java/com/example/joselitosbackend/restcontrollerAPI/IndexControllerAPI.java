package com.example.joselitosbackend.restcontrollerAPI;

import com.example.joselitosbackend.dao.CountryDAO;
import com.example.joselitosbackend.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndexControllerAPI {

    @Autowired
    private CountryDAO countryDAO;

    @GetMapping("/")
    public String indexPage() {

        return "Welcome to the jungle";
    }

    @GetMapping("/api/countries")
    public List<Country> getCountries(){
        return countryDAO.getCountries();
    }

    @RequestMapping("/api/countries/{id}")
    public Country getOneCountry(@PathVariable int id) {

        return null;
    }

    @RequestMapping(value = "/api/countries/{id}", method = RequestMethod.DELETE)
    public void deleteOneCountry(@PathVariable int id) {
        countryDAO.eliminate(id);
    }

    @RequestMapping(value = "/api/countries/new", method = RequestMethod.POST)
    public void createOneCountry(@RequestBody Country country) {

        countryDAO.countryRegistration(country);
    }

    @RequestMapping(value = "/api/countries", method = RequestMethod.PUT)
    public void updateOneCountry(@RequestBody Country country) {

        countryDAO.updateOneCountry(country);
    }
}
