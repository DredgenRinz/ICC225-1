/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Okumura
 */
public class PaisDAOImpl {
    
    public static PaisDAOImpl instancia = null;
    public static PaisDAOImpl getInstance(){
        if(instancia == null){
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }
    
    private static List paises = null;
    
    public static List getPaises(){
        if(paises == null){
        paises = new ArrayList();
        Pais p1 = new Pais("PERU");
        Pais p2 = new Pais("MEXICO");
        Pais p3 = new Pais("COLOMBIA");
        
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        }
        return paises;
    }
}
