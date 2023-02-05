/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebatecnicaapi.service;

import com.pruebatecnicaapi.entity.Localidad;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author yowte
 */
public interface LocalidadService {
    
    
    //muestra todo
    public List<Localidad> findAll();
    //solo habilitados
    public List<Localidad> findCustom();
    //id
    public Optional<Localidad> findById(int id);
    
    //
    public Localidad add(Localidad l);
    public Localidad update(Localidad l);
    public Localidad delete(Localidad l);
}
