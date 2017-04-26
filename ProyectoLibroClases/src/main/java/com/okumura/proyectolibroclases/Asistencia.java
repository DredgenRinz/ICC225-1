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
public class Asistencia {
     private String mes;
     private boolean [][] asistencia = new boolean[4][5];
     
     public Asistencia(){}
     
     public Asistencia(String mes){
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
    
}
