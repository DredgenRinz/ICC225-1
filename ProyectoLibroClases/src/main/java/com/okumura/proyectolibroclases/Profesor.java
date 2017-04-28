/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Okumura
 */
@XmlAccessorType (XmlAccessType.FIELD)
public class Profesor extends Persona{
    private String Asignatura;
    
    public Profesor(){}
    
    /**
     * Clase que representa a un Profesor
     * @param nombre Indica el nombre del Profesor.
     * @param Asignatura Indica la Asignatura que imparte el profesor.
     */
    public Profesor(String nombre, String Asignatura) {
        super(nombre);
        this.Asignatura = Asignatura;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    
}
