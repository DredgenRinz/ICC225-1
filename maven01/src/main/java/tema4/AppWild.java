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
public class AppWild {
    public void listarUpperBounded (List<? extends Persona> lista){
        for(Persona a : lista){
                System.out.println((a.getNombre()));           
        }
    }

    public void listarLowerBounded (List<? super Alumno> lista){
        for(Object a : lista){
                System.out.println((((Alumno)a).getNombre()));           
        }
    }    
    
    public void listarUnBounded (List<?> lista){
        for(Object a : lista){
            if(a instanceof Alumno){
                System.out.println((((Alumno)a).getNombre())); 
            }else if(a instanceof Profesor){
                System.out.println((((Profesor)a).getNombre())); 
            }
                          
        }
    }    
        
    
    public static void main(String[] args){
        AppWild aw = new AppWild();
        
        Alumno al1 = new Alumno("Troll");
        Alumno al2 = new Alumno("Yolo");
        Alumno al3 = new Alumno("Manco");
        
        List lista = new ArrayList<>();
        lista.add(al1);
        lista.add(al2);
        lista.add(al3);
        
        aw.listarUpperBounded(lista);
        System.out.println();
        aw.listarLowerBounded(lista);
        System.out.println();
        aw.listarUnBounded(lista);
    }
}
