/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Comparator;

/**
 *
 * @author Okumura
 */
public class NombreComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2){
        Persona per1 = (Persona)obj1;
        Persona per2 = (Persona)obj2;
        return per1.getNombre().compareTo(per2.getNombre());
    }
}
