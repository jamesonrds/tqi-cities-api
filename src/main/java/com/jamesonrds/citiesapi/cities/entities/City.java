package com.jamesonrds.citiesapi.cities.entities;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.springframework.data.geo.Point;

public class City {
    
    @Id
    private Long id;
  
    @Column(name = "nome")
    private String name;
  
    private Integer uf;
  
    private Integer ibge;
  
    // 1st point
    @Column(name = "lat_lon")
    private String geolocation;
  
    // 2nd point
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;
  
    public City() {
    }

    public City(final Long id, final String name, final Integer uf, final Integer ibge,
              final String geolocation, final Point location) {
    this.id = id;
    this.name = name;
    this.uf = uf;
    this.ibge = ibge;
    this.geolocation = geolocation;
    this.location = location;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getUf() {
    return uf;
  }

  public Integer getIbge() {
    return ibge;
  }

  public String getGeolocation() {
    return geolocation;
  }

  public Point getLocation() {
    return location;
  }

}
