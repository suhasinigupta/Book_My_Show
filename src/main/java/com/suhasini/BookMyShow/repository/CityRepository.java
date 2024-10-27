package com.suhasini.BookMyShow.repository;

import com.suhasini.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
     City findCityByName(String cityname) ;
}
