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
    
    /**
     * Constructor sin Parametros.
     */
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

    /**
     * Getter del Asignatura
     * @return String asignatura
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * Setter del elemento Asignatura
     * @param asignatura String de asignatura
     */
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    /**
     * Getter del entero Curso
     * @return Integer of Curso
     */
    public int getCurso() {
        return curso;
    }

    /**
     * Setter del Entero Curso
     * @param curso integer of Curso
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }

    /**
     * Getter del String Objetivo
     * @return String Objetivo
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * Setter del String Objetivo
     * @param objetivo string objetivo
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * Getter del Vector de String Actividades
     * @return String vector of actividades
     */
    public String[] getActividades() {
        return actividades;
    }

    /**
     * Setter del Vector de String Actividades
     * @param actividades String Vector
     */
    public void setActividades(String[] actividades) {
        this.actividades = actividades;
    }

}
