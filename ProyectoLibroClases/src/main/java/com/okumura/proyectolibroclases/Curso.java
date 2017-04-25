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
 *
 * @author Okumura
 */
@XmlRootElement(name = "Curso")
@XmlAccessorType (XmlAccessType.FIELD)
public class Curso {
    
    private int numeroCurso;
    private String letraCurso;
    private Profesor profesor;
   
    @XmlElement(name = "Alumno")
    private List<Alumno> listaAlumnos = null;

    public Curso(int numeroCurso, String letraCurso) {
        this.numeroCurso = numeroCurso;
        this.letraCurso = letraCurso;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getlistaAlumnos() {
        return listaAlumnos;
    }

    public void setlistaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public int getNumeroCurso() {
        return numeroCurso;
    }

    public void setNumeroCurso(int numeroCurso) {
        this.numeroCurso = numeroCurso;
    }

    public String getLetraCurso() {
        return letraCurso;
    }

    public void setLetraCurso(String letraCurso) {
        this.letraCurso = letraCurso;
    }

    public Curso() {
    }
    
    
}
