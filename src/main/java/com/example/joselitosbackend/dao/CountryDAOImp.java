package com.example.joselitosbackend.dao;

import com.example.joselitosbackend.model.Country;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CountryDAOImp implements CountryDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Country> getCountries() {
        String query = "FROM Country";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminate(int id) {
        Country country = entityManager.find(Country.class, id);
        entityManager.remove(country);
    }

    @Override
    public void countryRegistration(Country country) {
        entityManager.merge(country);
    }

    @Override
    public void updateOneCountry(Country country) {
        entityManager.merge(country);
    }


}
