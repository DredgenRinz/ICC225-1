/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

/**
 *
 * @author Okumura
 */
public class Notas {
    private String Asignatura;
    private Double[] notas = new Double[5];

    public Notas(){}
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
