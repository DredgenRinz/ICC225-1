/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploXMLJAXP;

import java.io.ByteArrayOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 *
 * @author Okumura
 */
public class JAXPDOM {

    public static String obtenerCarteleraHMTL() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
// Usar JAXP DOM para generar Document con fichero xml
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("cartelera.xml");
// Generar un objeto transformer para realizar transform XSL
            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource stylesource = new StreamSource("cartelera.xsl");
            Transformer transformer = tFactory.newTransformer(stylesource);
            DOMSource source = new DOMSource(document);
            ByteArrayOutputStream outputByteArray = new ByteArrayOutputStream();
            StreamResult result = new StreamResult(outputByteArray);
            transformer.transform(source, result);
            return outputByteArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
