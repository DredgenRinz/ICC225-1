/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcces;

import com.okumura.proyectolibroclases.Alumno;
import com.okumura.proyectolibroclases.Colegio;
import com.okumura.proyectolibroclases.Curso;
import com.okumura.proyectolibroclases.Profesor;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 **Conversion de un XML a un Objeto de clase Colegio
 * @author Okumura
 * 
 */
public class Xml {
    
    public Colegio getXmlData(){
        Colegio xml = null;
        try{
        File file = new File("Colegio.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class,Profesor.class,Curso.class,Colegio.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                xml = (Colegio) jaxbUnmarshaller.unmarshal(file);
        } catch(JAXBException e){
            e.printStackTrace();
        }
        return xml;
    }

    /** 
    **Clase que convierte un Objeto en XML
    * @param colegio objeto a convertir en xml
    */
    public void setXmlData(Colegio colegio){
        try{
        File file = new File("Colegio.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class,Profesor.class,Curso.class,Colegio.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(colegio, file);
        } catch(JAXBException e){
            e.printStackTrace();
        }
    }    
    
}
