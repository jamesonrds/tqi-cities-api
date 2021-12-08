package com.jamesonrds.citiesapi.countries.resources;

import com.jamesonrds.citiesapi.countries.entities.Country;
import com.jamesonrds.citiesapi.countries.repositories.CountryRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

  @Autowired
  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<Country> countries() {
    return repository.findAll();
  }

  @GetMapping("/id")
  public Country getOne(@PathVariable Long id){
    Optional<Country> optional = repository.findById(id);
    return optional.get();
  }
}
