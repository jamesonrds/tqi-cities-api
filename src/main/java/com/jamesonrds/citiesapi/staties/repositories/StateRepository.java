package com.jamesonrds.citiesapi.staties.repositories;

import com.jamesonrds.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
