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
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testGetModel() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getModel");
        final String MODEL = "ourmodel";
        final String FIELD_NAME = "registrationNumber";
        final Field field = carOverview.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(carOverview, MODEL);
        final String RESULT = carOverview.getModel();

        assertEquals("Pola nie pasują", RESULT, MODEL);
    }

    /**
     * Test of getBrand method, of class CarOverview.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testGetBrand() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getBrand");
        final String BRAND = "ourmodel";
        final String FIELD_NAME = "brand";
        final Field field = carOverview.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(carOverview, BRAND);
        final String RESULT = carOverview.getBrand();

        assertEquals("Pola nie pasują", RESULT, BRAND);
    }

    /**
     * Test of equals method, of class CarOverview.
     */
    @Test
    public void testTheSameEquals() {
        System.out.println("equals");
        CarOverview obj = new CarOverview("Opel", "Astra");
        CarOverview instance = new CarOverview("Opel", "Astra");
        final boolean EXPECTED_RESULT = true;
        
        final boolean RESULT = instance.equals(obj);
        
        assertEquals("Obiekty, nie są tożsame", EXPECTED_RESULT, RESULT);
    }
    
    /**
     * Test of equals method, of class CarOverview.
     */
    @Test
    public void testDifferentEquals() {
        System.out.println("equals");
        CarOverview obj = new CarOverview("Skoda", "Fabia");
        CarOverview instance = new CarOverview("Opel", "Astra");
        final boolean EXPECTED_RESULT = false;
        
        final boolean RESULT = instance.equals(obj);
        
        assertEquals("Obiekty, nie są tożsame", EXPECTED_RESULT, RESULT);
    }
}
