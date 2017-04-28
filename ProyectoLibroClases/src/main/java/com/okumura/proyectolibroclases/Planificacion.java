/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

/**
 * Clase que hace referencia a la Planificacion de una Asignatura.
 * @author Okumura
 */
public class Planificacion {
    private String asignatura;
    private int curso;
    private String objetivo;
    private String [] actividades;
    
    public Planificacion(){}
    
    /**
     * Constructor especializado de Planificacion
     * @param asignatura indica La asignatura referenciada
     * @param curso Indica el Curso Referenciado
     */
    public Planificacion(String asignatura, int curso) {
        this.asignatura = asignatura;
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String[] getActividades() {
        return actividades;
    }

    public void setActividades(String[] actividades) {
        this.actividades = actividades;
    }

}
