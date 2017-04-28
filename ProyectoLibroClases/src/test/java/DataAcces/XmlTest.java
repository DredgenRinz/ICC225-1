/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcces;

import com.okumura.proyectolibroclases.Colegio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Okumura
 */
public class XmlTest {
    
    public XmlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getXmlData method, of class Xml.
     */
    @org.junit.Test
    public void testGetXmlData() {
        System.out.println("getXmlData");
        Xml instance = new Xml();
        Colegio expResult = null;
        Colegio result = instance.getXmlData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXmlData method, of class Xml.
     */
    @org.junit.Test
    public void testSetXmlData() {
        System.out.println("setXmlData");
        Colegio colegio = null;
        Xml instance = new Xml();
        instance.setXmlData(colegio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
