/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Okumura
 */
public class Clase<T,K,V,E> {
    
    private T objetoT;
    private K objetoK;
    private V objetoV;
    private E objetoE;
    
    public Clase(T objetoT, K objetoK, V objetoV, E objetoE){
        this.objetoT = objetoT;
        this.objetoK = objetoK;
        this.objetoV = objetoV;
        this.objetoE = objetoE;
    }
    
    public void mostrarTipo(){
        System.out.println("T es un: " + objetoT.getClass().getName());
        System.out.println("K es un: " + objetoK.getClass().getName());
        System.out.println("V es un: " + objetoV.getClass().getName());
        System.out.println("E es un: " + objetoE.getClass().getName());
    }
}
