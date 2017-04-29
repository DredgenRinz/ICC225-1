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
public class Nota {
    
    private String Asignatura;
    private List<Double> nota;

    /**
     * Constructor Sin Parametros.
     */
    public Nota(){}
    
    /**
     * Constructor especializado de Asignatura
     * @param Asignatura Indica que Asignatura representara la clase.
     */
    public Nota(String Asignatura) {
        this.Asignatura = Asignatura;
        nota = new ArrayList<>();
    }

    /**
     * Getter del elemento Asignatura
     * @return String Asignatura
     */
    public String getAsignatura() {
        return Asignatura;
    }

    /**
     * Setter del elemento Asignatura
     * @param Asignatura String Asignatura
     */
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    /**
     * Getter del ArrayList de Nota
     * @return List de Dobule Nota
     */
    public List<Double> getNotas() {
        return nota;
    }

    /**
     * Setter del ArrayList Nota
     * @param notas ArrayList de Double de notas
     */
    public void setNotas(List<Double> notas) {
        this.nota = notas;
    }

    /**
     * Metodo que Agrega una nota directamente al ArrayList
     * @param nota Double de nota
     */
    public void addNota(Double nota){
        this.nota.add(nota);
    }
    
}
