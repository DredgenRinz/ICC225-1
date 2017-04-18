/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploTema6;

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
        List<Animal> lista = new ArrayList<>();
        lista.add(new Animal("Carlos","Gato",6));
        lista.add(new Animal("Giaco","Gato",11));
        lista.add(new Animal("Eduardo","Perro",7));
        lista.add(new Animal("Camille","Serpiente",9));
        lista.add(new Animal("Daniel","Raton",3));
        lista.add(new Animal("Victoria","Cui",2));
        lista.add(new Animal("Fierro","Rana",2));
        
        Collections.sort(lista);
        
        for(Animal a : lista){
            System.out.println(a.getNombre()+" "+a.getTipo()+" "+a.getEdad());
        }
        System.out.println();
        
        Collections.sort(lista,new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getTipo().compareTo(a2.getTipo());
            }
        });
        
        for(Animal a : lista){
            System.out.println(a.getNombre()+" "+a.getTipo()+" "+a.getEdad());
        }
        
    }
}
