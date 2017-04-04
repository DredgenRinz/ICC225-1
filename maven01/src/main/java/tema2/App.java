/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Okumura
 */
public class App {
    
    private static List canasta = new ArrayList();
    
    private static void verificar(Object objeto){
        if(objeto instanceof Fruta){
            canasta.add(objeto);
            System.out.println("Fruta agregada "+((Fruta) objeto).getNombre());
        }else{
            System.out.println("Elemento no permitido, solo frutas profavor");
        }
    }
    
    
    public static void main(String[] args){
        String texto = new String("MitoCode");
        
        /*if(texto instanceof String){
            System.out.println("Es un String");
        }*/
        
        /*Alumno al = new Alumno();
        if(al instanceof Persona){
            System.out.println("Es una Persona");
        }*/
        
        System.out.println("Canasta abierta, por favor ingresar SOLO frutas");
        
        Manzana m1 = new Manzana("ROJA");
        Manzana m2 = new Manzana("VERDE");
        Naranja n1 = new Naranja("NARANJA SIN PEPA");
        Galleta g1 = new Galleta("CHOCOLATE");
        
        verificar(m1);
        verificar(m2);
        verificar(n1);
        verificar(g1);
    }
}
