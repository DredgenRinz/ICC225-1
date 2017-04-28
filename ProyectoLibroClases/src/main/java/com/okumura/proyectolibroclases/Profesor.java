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
    
    /**
     * Constructor sin Parametros.
     */
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

    /**
     * Getter del elemento de Asignatura
     * @return String Asignatura
     */
    public String getAsignatura() {
        return Asignatura;
    }

    /**
     * Setter del elemento Asignatura
     * @param Asignatura String Asignatura
     */
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    
}
