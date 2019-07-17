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
public class CarOverviewTest {
    private CarOverview carOverview;
    
    public CarOverviewTest() {
    }
    
    @Before
    public void setUp() {
        String brand = "Opel";
        String model = "Astra";
        carOverview = new CarOverview(model,brand);
    }

    /**
     * Test of setModel method, of class CarOverview.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testSetModel() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setModel");
        final String MODEL="Astra";
        final String FIELD_NAME = "model";
        
        carOverview.setModel(MODEL);
        final Field field = carOverview.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(carOverview), MODEL);
    }

    /**
     * Test of setBrand method, of class CarOverview.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testSetBrand() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setBrand");
        final String BRAND="Opel";
        final String FIELD_NAME = "brand";
        
        carOverview.setModel(BRAND);
        final Field field = carOverview.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(carOverview), BRAND);
    }

    /**
     * Test of getModel method, of class CarOverview.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        CarOverview instance = null;
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrand method, of class CarOverview.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        CarOverview instance = null;
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class CarOverview.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        CarOverview instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class CarOverview.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        CarOverview instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
