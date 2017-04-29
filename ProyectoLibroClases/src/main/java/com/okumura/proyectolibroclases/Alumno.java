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
 *Clase de tipo Alumno, Extendida de Persona que implementa un Comparable para utilizar el metodo sort.
 * @author Okumura
 */
@XmlAccessorType (XmlAccessType.FIELD)
public class Alumno extends Persona implements Comparable{
    
    private String anotaciones = "";
    private List<Asistencia> asistencia = null;
    private List<Nota> calificaciones = null;
    private String apoderado;
    
    /**
     * Constructor sin Parametros.
     */
    public Alumno(){}
    
    /**
     * Constructor de la Clase Alumno
     * @param apoderado Nombre del Apoderado 
     * @param nombre Variable que contiene el nombre del alumno
     */
    public Alumno(String apoderado, String nombre) {
        super(nombre);
        this.apoderado = apoderado;
    }
    
    /**
     *Getter del Array Nota.
     * @return Lista de Nota.
     */
    public List<Nota> getNotas() {
        return calificaciones;
    }

    /**
     * Setter del Array Nota.
     * @param notas Array de Nota
     */
    public void setNotas(List<Nota> notas) {
        this.calificaciones = notas;
    }

    /**
     * Getter del ArrayList de Asistencia
     * @return Asistencia
     */
    public List<Asistencia> getAsistencia() {
        return asistencia;
    }

    /**
     * Setter de Asistencia
     * @param asistencia Lista Asistencia
     */
    public void setAsistencia(List<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }
    
    /**
     * Getter del elemento Anotaciones
     * @return anotaciones
     */
    public String getAnotaciones() {
        return anotaciones;
    }

    /**
     * Setter  del elemento anotaciones
     * @param anotaciones String
     */
    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    /**
     * Getter del elemento Apoderado
     * @return String 
     */
    public String getApoderado() {
        return apoderado;
    }

    /**
     * Setter del elemento Apoderado
     * @param apoderado String
     */
    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }
    /**
     * Clase que compara 2 objetos de tipo Alumno, metodo sobre escrito del Collections.sort
     * @param o Object a comparar
     * @return valor para comparar y ordenar array
     */
    @Override
    public int compareTo(Object o) {
        Alumno per = (Alumno) o;
        return this.getNombre().compareTo(per.getNombre());
    }
    
}
