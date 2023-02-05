/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebatecnicaapi.restcontroller;

import com.pruebatecnicaapi.entity.Localidad;
import com.pruebatecnicaapi.service.LocalidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yowte
 */

@RestController
@RequestMapping("/Localidad")
public class LocalidadRestController {
    @Autowired
    private LocalidadService servicio; 
    
    @GetMapping
    public List<Localidad> findAll(){
        return servicio.findAll();
    }
    
    
    
}
