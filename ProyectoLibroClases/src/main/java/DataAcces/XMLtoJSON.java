package DataAcces;

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
 *
 * @author Okumura
 */
public class XMLtoJSON {

    /**
     * Aplicacion que convierte un XML a Json
     * @param args
     * @throws Exception
     */
    public static void parserXMLtoJSON(Object target) throws IOException, TransformerException {

        XStream parsel = new XStream(new StaxDriver());

        String xml = parsel.toXML(target);

        Path archivo = Paths.get("colegio/colegio.json");

        Files.write(archivo, XML.toJSONObject(xml).toString().getBytes());

        System.out.println("JSON creado");

    }    
    
}
