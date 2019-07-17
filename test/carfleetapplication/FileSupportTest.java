/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

import java.lang.reflect.Field;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damian
 */
public class FileSupportTest {
    FileSupport fileSupport;
    
    public FileSupportTest() {
        String[] extensions = new String[]{"txt", "xls"};
        fileSupport = new FileSupport(extensions);
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
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testSetExtensions() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setExtensions");
        final String[] EXTENSIONS = new String[]{"txt","xls"};
        final String FIELD_NAME = "extensions";
        
        fileSupport.setExtensions(EXTENSIONS); 
        final Field field = fileSupport.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(fileSupport), EXTENSIONS);
    }

    /**
     * Test of getExtensions method, of class FileSupport.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testGetExtensions() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getExtensions");
        final String[] EXTENSIONS = new String[]{"txt","xls"};
        final String FIELD_NAME = "extensions";
        final Field field = fileSupport.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(fileSupport, EXTENSIONS);
        final String[] RESULT = fileSupport.getExtensions();

        assertEquals("Pola nie pasują", RESULT, EXTENSIONS);
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
