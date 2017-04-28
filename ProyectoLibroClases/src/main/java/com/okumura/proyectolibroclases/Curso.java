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
 *Clase que representa un Curso de 30 Alumnos
 * @author Okumura
 */
@XmlRootElement(name = "Curso")
@XmlAccessorType (XmlAccessType.FIELD)
public class Curso {
    
    private int numeroCurso;
    private String letraCurso;
    @XmlElement(name = "Profesor_Asignatura")
    private List<Profesor> profesor = new ArrayList<>();
   
    @XmlElement(name = "Alumno")
    private List<Alumno> listaAlumnos = null;
    
    public Curso() {
    }
    /**
     * Constructor especializado de alumno.
     * @param numeroCurso refiere al Numero del Curso.
     * @param letraCurso Indica la Letra del Curso.
     */
    public Curso(int numeroCurso, String letraCurso) {
        this.numeroCurso = numeroCurso;
        this.letraCurso = letraCurso;
    }

    public List<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<Profesor> profesor) {
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
    
}
