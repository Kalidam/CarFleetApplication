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
    public void testSetDriver() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setDriver");
        final String NAME="Janek";
        final String SURNAME="Jankowski";
        final String FIELD_NAME = "driver";
        final Employee DRIVER=new Employee(NAME, SURNAME);
        car.setDriver(DRIVER); 
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(car), DRIVER);
    }

    /**
     * Test of getDriver method, of class Car.
     */
    @Test
    public void testGetDriver() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getDriver");
        final String NAME="Janek";
        final String SURNAME="Jankowski";
        final String FIELD_NAME = "driver";
        final Employee DRIVER=new Employee(NAME, SURNAME);
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, DRIVER);
        final Employee result = car.getDriver();

        assertEquals("Pola nie pasują", result, DRIVER);
    }

    /**
     * Test of setCarOverview method, of class Car.
     */
    @Test
    public void testSetCarOverview() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setCarOverview");
        final String BRAND="Opel";
        final String MODEL="Omega";
        final String FIELD_NAME = "carOverview";
        final CarOverview CAR_OVERVIEW=new CarOverview(MODEL, BRAND);
        car.setCarOverview(CAR_OVERVIEW); 
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(car), CAR_OVERVIEW);
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
    public void testGetBrand() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getBrand");
        final String BRAND = "ourbrand";
        final String FIELD_NAME = "brand";
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, BRAND);
        final String result = car.getBrand();

        assertEquals("Pola nie pasują", result, BRAND);
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getModel");
        final String MODEL = "ourmodel";
        final String FIELD_NAME = "model";
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, MODEL);
        final String result = car.getModel();

        assertEquals("Pola nie pasują", result, MODEL);
    }

    /**
     * Test of getRegistrationNumber method, of class Car.
     */
    @Test
    public void testGetRegistrationNumber() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getRegistrationNumber");
        final String REGISTRATION_NUMBER = "ourRegistrationNumber";
        final String FIELD_NAME = "registrationNUmber";
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, REGISTRATION_NUMBER);
        final String result = car.getRegistrationNumber();

        assertEquals("Pola nie pasują", result, REGISTRATION_NUMBER);
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getName");
        final String NAME = "ourmname";
        final String FIELD_NAME = "name";
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, NAME);
        final String result = car.getName();

        assertEquals("Pola nie pasują", result, NAME);
    }

    /**
     * Test of getSurname method, of class Car.
     */
    @Test
    public void testGetSurname() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getSurname");
        final String SURNAME = "oursurname";
        final String FIELD_NAME = "surname";
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, SURNAME);
        final String result = car.getSurname();

        assertEquals("Pola nie pasują", result, SURNAME);
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