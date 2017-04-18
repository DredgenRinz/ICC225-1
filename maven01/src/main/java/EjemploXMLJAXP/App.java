/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploXMLJAXP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Okumura
 */
public class App {

    /**
     * Aplicacion que comvierte un archivo xml a html
     * @param agsgsad
     * @throws IOException
     */
    public static void main (String [] agsgsad) throws IOException{
        System.out.println( JAXPDOM.obtenerCarteleraHMTL());
        try{
        FileWriter fileWriter = new FileWriter("Cartelera.html");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(JAXPDOM.obtenerCarteleraHMTL());
        bufferedWriter.close();
        } catch(Exception e){
            System.out.println("Error writing to file ");
        }
        
       
        
    }
}
