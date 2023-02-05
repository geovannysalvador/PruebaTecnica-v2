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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;



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
@Entity(name = "Eventos")
@Table(name = "eventos")
public class Eventos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ideventos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "estatusevento")
    private boolean estadoevento;
    
    @Column(name = "nomevento")
    private String nomevento;
    
    @Column(name = "lugarevento")
    private String lugareven;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fechaevento")
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "localidad_idlocalidad", nullable = false)
    private Localidad localidad;
    
}
