/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebatecnicaapi.service;

import com.pruebatecnicaapi.entity.Eventos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author yowte
 */
public interface EventosService {
    
    //muestra todo
    public List<Eventos> findAll();
    //solo habilitados
    public List<Eventos> findCustom();
    //id
    public Optional<Eventos> findById(int id);
    
    //
    public Eventos add(Eventos e);
    public Eventos update(Eventos e);
    public Eventos delete(Eventos e);
}
