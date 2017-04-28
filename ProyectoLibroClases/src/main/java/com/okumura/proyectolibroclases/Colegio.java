/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Clase que representa un colegio X
 * @author Okumura
 */
@XmlRootElement(name = "Colegio")
@XmlAccessorType (XmlAccessType.FIELD)
public class Colegio {
    @XmlElement(name = "Planificacion")
    private List <Planificacion> plan = new ArrayList<>();
    
    /**
     * Getter del Array de Planificacion
     * @return Array de Planificacion
     */
    public List<Planificacion> getPlan() {
        return plan;
    }

    /**
     * Setter del array de Planificacion
     * @param plan Array de Planificacion
     */
    public void setPlan(List<Planificacion> plan) {
        this.plan = plan;
    }
    @XmlElement(name = "Cursos")
    private List <Curso> cursos = new ArrayList<>();

    /**
     * Getter del ArrayList de Cursos
     * @return Array of Cursos
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * Setter del ArrayList de Cursos
     * @param cursos Array of Cursos
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
