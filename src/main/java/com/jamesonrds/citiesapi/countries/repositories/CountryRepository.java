package com.jamesonrds.citiesapi.countries.repositories;

import com.jamesonrds.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
