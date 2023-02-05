/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebatecnicaapi.service;

import com.pruebatecnicaapi.entity.Localidad;
import com.pruebatecnicaapi.repository.LocalidadRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yowte
 */
@Service
public class LocalidadServicempl implements LocalidadService{
    
    @Autowired
    private LocalidadRepository repositorio;

    @Override
    public List<Localidad> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Localidad> findCustom() {
       return repositorio.findAllCustom();
    }

    @Override
    public Optional<Localidad> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Localidad add(Localidad l) {
        return repositorio.save(l);
    }

    @Override
    public Localidad update(Localidad l) {
        //obtener el id
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Localidad delete(Localidad l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
