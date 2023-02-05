/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebatecnicaapi.repository;

import com.pruebatecnicaapi.entity.Eventos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author yowte
 */
public interface EventosRepository extends JpaRepository<Eventos, Integer> {
    //creacion de metodos 
    
    @Query("select e from Eventos e where e.estado='1'")
    List<Eventos> findAllCustom();
}
