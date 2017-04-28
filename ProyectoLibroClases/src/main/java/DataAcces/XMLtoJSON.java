package DataAcces;

import com.okumura.proyectolibroclases.Alumno;
import com.okumura.proyectolibroclases.Colegio;
import com.okumura.proyectolibroclases.Curso;
import com.okumura.proyectolibroclases.Profesor;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.XML;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.transform.TransformerException;

/**
 *Clase parser de Object a JSON
 * @author Okumura
 */
public class XMLtoJSON {

    /**
     * Aplicacion que convierte un Objeto a Json
     * @param target Objeto de clase colegio 
     * @throws java.io.IOException@throws javax.xml.transform.TransformerException     
     * @throws javax.xml.transform.TransformerException     
     */
    public static void XMLtoGSON(Colegio target) throws IOException, TransformerException {

        XStream parsel = new XStream(new StaxDriver());

        String xml = parsel.toXML(target);

        Path archivo = Paths.get("colegio/colegio.json");

        Files.write(archivo, XML.toJSONObject(xml).toString().getBytes());

        System.out.println("JSON creado");

    }    
    
}
