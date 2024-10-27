package com.suhasini.BookMyShow.controller;

import com.suhasini.BookMyShow.dto.CityDTO;
import com.suhasini.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService ;

    @GetMapping("/city/{name}")
    public ResponseEntity showCityByName(@PathVariable String name){
          return ResponseEntity.ok(cityService.findCityByName(name)) ;
    }

    @GetMapping("/city")
    public ResponseEntity getAllcities(){
        return ResponseEntity.ok(cityService.fingAllCities()) ;
    }

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityDTO cityDTO ){
        cityService.createCityByName(cityDTO.getName()) ;
         return null ;
    }

    public ResponseEntity deleteCity(@PathVariable int id){
        boolean val =cityService.deleteCityById(id) ;
        return ResponseEntity.ok(val) ;
    }
}
