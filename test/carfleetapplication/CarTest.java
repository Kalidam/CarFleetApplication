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
public class CarTest {
    
    private Car car;
    
    @Before
    public void setUp() {
        String brand="Opel";
        String model="Astra";
        CarOverview carOverview=new CarOverview(brand,model);
        String name="Jan";
        String surname="Kowalski";
        Employee driver=new Employee(name,surname);
        String registrationNumber="WPI 1234X";
        car=new Car(carOverview,registrationNumber,driver);
    }

    /**
     * Test of setDriver method, of class Car.
     */
    @Test
    public void testSetDriver() {
        System.out.println("setDriver");
        Employee driver = null;
        Car instance = null;
        instance.setDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDriver method, of class Car.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Car instance = null;
        Employee expResult = null;
        Employee result = instance.getDriver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarOverview method, of class Car.
     */
    @Test
    public void testSetCarOverview() {
        System.out.println("setCarOverview");
        CarOverview carOverview = null;
        Car instance = null;
        instance.setCarOverview(carOverview);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistrationNumber method, of class Car.
     */
    @Test
    public void testSetRegistrationNumber() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setRegistrationNumber");
        final String REGISTRATION_NUMBER = "our registration number";
        final String FIELD_NAME = "registrationNumber";
        
        car.setRegistrationNumber(REGISTRATION_NUMBER); 
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(car), REGISTRATION_NUMBER);
    }

    /**
     * Test of getBrand method, of class Car.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        Car instance = null;
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Car instance = null;
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistrationNumber method, of class Car.
     */
    @Test
    public void testGetRegistrationNumber() {
        System.out.println("getRegistrationNumber");
        Car instance = null;
        String expResult = "";
        String result = instance.getRegistrationNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Car.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Car instance = null;
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Car.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Car instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}