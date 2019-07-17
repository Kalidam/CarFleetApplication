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
    public void testSetFileLocationSuccess() {
        System.out.println("setFileLocation");
        final String FILE_LOCATION_TO_CHECK = "C:\\Program Files\\test.txt";
        final String[] EXTENSIONS = new String[]{"txt", "xls"};
        fileSupport = new FileSupport(EXTENSIONS);
        fileSupport.setFileLocation(FILE_LOCATION_TO_CHECK);
    }

    /**
     * Test of setFileLocation method, of class FileSupport.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testSetFileLocation() {
        System.out.println("setFileLocation");
        final String FILE_LOCATION_TO_CHECK = "";
        fileSupport.setFileLocation(FILE_LOCATION_TO_CHECK);
    }
    
    /**
     * Test of getFileLocation method, of class FileSupport.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testGetFileLocation() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getFileLocation");
        final String FILE_LOCATION = "C:\\Program Files\\test.txt";
        final String FIELD_NAME = "fileLocation";
        final Field field = fileSupport.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(fileSupport, FILE_LOCATION);
        final String RESULT = fileSupport.getFileLocation();

        assertEquals("Pola nie pasują", RESULT, FILE_LOCATION);
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
}
