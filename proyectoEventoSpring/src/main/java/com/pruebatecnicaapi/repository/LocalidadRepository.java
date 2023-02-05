/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebatecnicaapi.repository;

import com.pruebatecnicaapi.entity.Localidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author yowte
 */
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
    
    @Query("select l from Localidad l where l.estado='1'")
    List<Localidad> findAllCustom();
}
