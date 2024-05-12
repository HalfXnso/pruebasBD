/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.Vehiculo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Alfonso
 */
public interface LocalRepository extends JpaRepository<Vehiculo, Long>{
@Query("SELECT l FROM Vehiculo WHERE l.matricula = :matricula")    
Optional<Vehiculo> findCarByNameWithJPQL(String name);

}
