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
@XmlAccessorType (XmlAccessType.FIELD)
public class Alumno extends Persona implements Comparable{
    
    private String anotaciones = "";
    private List<Asistencia> asistencia = null;
    private List<Notas> notas = null;
    private String apoderado;
    
    public Alumno(){}
    
    public Alumno(String apoderado, String nombre) {
        super(nombre);
        this.apoderado = apoderado;
    }
    public List<Notas> getNotas() {
        return notas;
    }

    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }

    public List<Asistencia> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(List<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }
    

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }
    
    @Override
    public int compareTo(Object o) {
        Alumno per = (Alumno) o;
        return this.getNombre().compareTo(per.getNombre());
    }
    
}
