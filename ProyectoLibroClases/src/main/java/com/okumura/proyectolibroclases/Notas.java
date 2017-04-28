/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

/**
 *Clase que hace referencia a las notas de un Alumno con un Vector de 5 elementos
 * @author Okumura
 */
public class Notas {
    
    private String Asignatura;
    private Double[] notas = new Double[5];

    public Notas(){}
    /**
     * Constructor especializado de Asignatura
     * @param Asignatura Indica que Asignatura representara la clase.
     */
    public Notas(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
}
