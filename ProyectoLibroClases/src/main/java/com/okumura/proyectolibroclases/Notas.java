/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

import java.util.ArrayList;
import java.util.List;

/**
 *Clase que hace referencia a las notas de un Alumno con un Vector de 5 elementos
 * @author Okumura
 */
public class Notas {
    
    private String Asignatura;
    private List<Double> notas;

    public Notas(){}
    /**
     * Constructor especializado de Asignatura
     * @param Asignatura Indica que Asignatura representara la clase.
     */
    public Notas(String Asignatura) {
        this.Asignatura = Asignatura;
        notas = new ArrayList<>();
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    public void addNota(Double nota){
        this.notas.add(nota);
    }
    
}
