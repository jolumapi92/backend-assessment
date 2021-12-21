package com.example.joselitosbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @Column( name = "countryid")
    private int countryID;
    @Column(name = "country_name")
    private String countryName;
    @Column( name = "capital")
    private String capital;
    @Column( name = "population")
    private int population;
    @Column(name = "languageid")
    private int languageID;

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }


}
