package com.example.joselitosbackend.dao;

import com.example.joselitosbackend.model.Country;

import java.util.List;

public interface CountryDAO {

    List<Country> getCountries();

    void eliminate(int id);


    void countryRegistration(Country country);

    void updateOneCountry(Country country);
}
