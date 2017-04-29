/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

import javax.xml.bind.annotation.XmlElement;

/**
 * Clase que representa la Asistencia de un Alumno
 *
 * @author Okumura
 */
public class Asistencia {

    private String mes;
    private boolean[][] asistencia = new boolean[4][5];

    /**
     * Contructos sin Parametros.
     */
    public Asistencia() {
    }

    /**
     *Constructor especializado de la clase Asistencia.
     * @param mes se ingresa el mes que representara la clase.
     */
    public Asistencia(String mes) {
        this.mes = mes;
    }

    /**
     * Getter del elemento Mes
    * @return String
    */
    public String getMes() {
        return mes;
    }

    /**
     *Setter del elemento mes
     * @param mes String
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * Getter del Array Asistencia
     * @return boolean Array
     */
    public boolean[][] getAsistencia() {
        return asistencia;
    }

    /**
     * Setter del Array Asistencia
     * @param asistencia Array de boolean
     */
    public void setAsistencia(boolean[][] asistencia) {
        this.asistencia = asistencia;
    }
    
    /**
     * Setter de una celda de Asistencia
     * @param a valor boolean
     * @param x valor en x
     * @param y valor en y
     */
    public void setCell(boolean a, int x, int y){
        this.asistencia[x][y] = a;
    }

}
