/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damian
 */
public class FileSupportTest {
    
    public FileSupportTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of setFileLocation method, of class FileSupport.
     */
    @Test
    public void testSetFileLocation() {
        System.out.println("setFileLocation");
        String fileLocationToCheck = "";
        FileSupport instance = null;
        instance.setFileLocation(fileLocationToCheck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileLocation method, of class FileSupport.
     */
    @Test
    public void testGetFileLocation() {
        System.out.println("getFileLocation");
        FileSupport instance = null;
        String expResult = "";
        String result = instance.getFileLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExtensions method, of class FileSupport.
     */
    @Test
    public void testSetExtensions() {
        System.out.println("setExtensions");
        String[] extensions = null;
        FileSupport instance = null;
        instance.setExtensions(extensions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExtensions method, of class FileSupport.
     */
    @Test
    public void testGetExtensions() {
        System.out.println("getExtensions");
        FileSupport instance = null;
        String[] expResult = null;
        String[] result = instance.getExtensions();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printExtensions method, of class FileSupport.
     */
    @Test
    public void testPrintExtensions() {
        System.out.println("printExtensions");
        FileSupport instance = null;
        instance.printExtensions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
