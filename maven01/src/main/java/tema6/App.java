/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Okumura
 */
public class App {
    public static void main (String [] args){
        
        /*List<String> lista = new ArrayList<>();
        lista.add("yolo");
        lista.add("manco");
        lista.add("trollo");
        
        Collections.sort(lista);
        Collections.reverse(lista);
        */
        
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1,"Daniel",26));
        lista.add(new Persona(1,"Juan",15));
        lista.add(new Persona(1,"Eduardo",10));
        lista.add(new Persona(1,"Luis",23));
        lista.add(new Persona(1,"Giacomo",11));
        
        /*Collections.sort(lista,new NombreComparator());
        Collections.sort(lista,new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int rpta = 0;
                if(o1.getEdad() > o2.getEdad()){
                    rpta = 1;
                }else if(o1.getEdad() < o2.getEdad()){
                    rpta = -1;
                }else{
                    rpta = 0;
                }
                return rpta;
            }   
        });
        */
        Collections.sort(lista);
        for(Persona p : lista){
            System.out.println(p.getNombre());
        }
        
    }
}
