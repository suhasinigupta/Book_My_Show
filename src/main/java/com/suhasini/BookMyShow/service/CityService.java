package com.suhasini.BookMyShow.service;

import com.suhasini.BookMyShow.model.City;
import com.suhasini.BookMyShow.repository.CityRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository ;

    public List<City> fingAllCities(){
        return cityRepository.findAll() ;
    }

    public City findCityByName(String name){
        return cityRepository.findCityByName(name) ;
    }
    public City createCityByName(String name){
        City city =new City(name) ;
        return cityRepository.save(city) ;
    }

    public City createCityByCity(City city){
        return cityRepository.save(city) ;
    }

    public boolean deleteCityById(int id){
        cityRepository.deleteById(id) ;
        return true ;
    }
}
