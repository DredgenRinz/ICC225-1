/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Okumura
 */
@XmlAccessorType (XmlAccessType.FIELD)
public class Persona {
    private String nombre;

    /**
     * Constructor de Persona
     * @param nombre Indica el Nombre de Persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor sin Parametros
     */
    public Persona(){
        
    }

    /**
     * Getter del elemento nombre
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del elemento nombre
     * @param nombre String nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
