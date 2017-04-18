/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Okumura
 */
public class App {
    public static void main(String[] agrs){
        
        Clase<String,Integer,String,Double> c = new Clase<>("Yolo",4,"Ever",0.01);
        c.mostrarTipo();
        System.out.println("--------------------");
        
        List<Clase<String,Integer,String,Double>> lista = new ArrayList();
        lista.add(new Clase<>("Yolo",4,"Ever",0.01));
        
        for(Clase<String,Integer,String,Double> cl : lista){
            cl.mostrarTipo();
        }
        
        
        

    }
}
