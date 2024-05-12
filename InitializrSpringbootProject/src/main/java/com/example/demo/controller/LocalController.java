package com.example.demo.controller;

import com.example.demo.entity.Vehiculo;
import com.example.demo.service.LocalService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findCarByMatricula")
     Optional<Vehiculo>encuentraCochePorMatricula(@PathVariable String matricula){
        return localService.findCarByNameWithJPQL(matricula);
    }
    @GetMapping("/findCars")
    public List<Vehiculo> searchCars() {
        return localService.findAllVehicles();
    }
    @PostMapping("/createCar")
    public Vehiculo saveCar(@RequestBody Vehiculo vehiculo){
        return localService.saveCars(vehiculo);
    }
    @PutMapping("/updateCar/{id}")
    public Vehiculo updateCar(@PathVariable Long id, @RequestBody Vehiculo vehiculo){
        return localService.updateCar(id, vehiculo);
    }
@DeleteMapping("/deleteCar/{id}")
public String deleteLocal(@PathVariable Long id){
    localService.deleteCar(id);
    return "Vehiculo borrado";
}
}
