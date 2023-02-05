/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebatecnicaapi.service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.pruebatecnicaapi.entity.Eventos;
import com.pruebatecnicaapi.repository.EventosRepository;
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
public class EventosServicempl implements EventosService{
    
    @Autowired
    private EventosRepository repositorio;
    

    @Override
    public List<Eventos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Eventos> findCustom() {
       return repositorio.findAllCustom();
    }

    @Override
    public Optional<Eventos> findById(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Eventos add(Eventos e) {
        return repositorio.save(e);
    }

    @Override
    public Eventos update(Eventos e) {
        //obtener el id
        Eventos objeventos = repositorio.getById(e.getId());
        BeanUtils.copyProperties(e, objeventos);
        return repositorio.save(objeventos);
    }

    @Override
    public Eventos delete(Eventos e) {
       Eventos objeventos = repositorio.getById(e.getId());
       objeventos.setEstadoevento(false);
       return repositorio.save(objeventos);
    }
    
}
