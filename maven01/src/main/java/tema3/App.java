/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Iterator;

/**
 *
 * @author Okumura
 */
public class App {
    public static void main(String[] args){

        PaisDAOImpl dao = new PaisDAOImpl();
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println("*************");
        
        for (Iterator it = PaisDAOImpl.getPaises().iterator(); it.hasNext();) {
            Object obj = it.next();
            System.out.println(((Pais)obj).getNombre());
        }  
        
        System.out.println("*************");
        
        PaisDAOImpl daoi = PaisDAOImpl.getInstance();
        for(Object obj : daoi.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }         
    }
}
