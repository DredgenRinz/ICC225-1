/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

/**
 * Clase que representa la Asistencia de un Alumno
 *
 * @author Okumura
 */
public class Asistencia {

    private String mes;
    private boolean[][] asistencia = new boolean[4][5];

    public Asistencia() {
    }

    /**
     *Constructor especializado de la clase Asistencia.
     * @param mes se ingresa el mes que representara la clase.
     */
    public Asistencia(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public boolean[][] getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean[][] asistencia) {
        this.asistencia = asistencia;
    }
    
    public void setCell(boolean a, int x, int y){
        this.asistencia[x][y] = a;
    }

}
