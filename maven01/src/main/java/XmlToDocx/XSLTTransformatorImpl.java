/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlToDocx;

/**
 *
 * @author Okumura
 */
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTransformatorImpl {

   public static void transform(String inputFile, String outputFile, String xslFile) {
      TransformerFactory factory = TransformerFactory.newInstance();
      FileOutputStream outputStream = null;
      try {
         Transformer transformer = factory.newTransformer(new StreamSource(xslFile));
         outputStream = new FileOutputStream(outputFile);
         StreamResult outputTarget = new StreamResult(outputStream);
         transformer.transform(new StreamSource(inputFile), outputTarget);
      } catch (TransformerException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if (outputStream != null) {
            try {
               outputStream.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }
   }
}