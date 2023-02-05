/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebatecnicaapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author yowte
 */
//crea clase constructora
@Builder
//crea constructor con parametros
@AllArgsConstructor
//constrctor sin parametros
@NoArgsConstructor
//para acregar get y set
@Data
//entidades
@Entity(name = "Localidad")
@Table(name = "localidad")


public class Localidad implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "idlocalidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nomlocalidad")
    private String nombrelocalidad;
        
}
