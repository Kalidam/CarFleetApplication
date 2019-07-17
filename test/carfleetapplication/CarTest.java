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
        String brand = "Opel";
        String model = "Astra";
        CarOverview carOverview = new CarOverview(brand,model);
        String name = "Jan";
        String surname = "Kowalski";
        Employee driver = new Employee(name,surname);
        String registrationNumber = "WPI 1234X";
        car=new Car(carOverview,registrationNumber,driver);
    }

    /**
     * Test of setDriver method, of class Car.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testSetDriver() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setDriver");
        final String NAME = "Janek";
        final String SURNAME = "Jankowski";
        final String FIELD_NAME = "driver";
        final Employee DRIVER = new Employee(NAME, SURNAME);
        
        car.setDriver(DRIVER); 
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(car), DRIVER);
    }

    /**
     * Test of getDriver method, of class Car.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testGetDriver() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getDriver");
        final String NAME = "Janek";
        final String SURNAME = "Jankowski";
        final String FIELD_NAME = "driver";
        final Employee DRIVER = new Employee(NAME, SURNAME);
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, DRIVER);
        final Employee RESULT = car.getDriver();

        assertEquals("Pola nie pasują", RESULT, DRIVER);
    }

    /**
     * Test of setCarOverview method, of class Car.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testSetCarOverview() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setCarOverview");
        final String BRAND = "Opel";
        final String MODEL = "Omega";
        final String FIELD_NAME = "carOverview";
        final CarOverview CAR_OVERVIEW = new CarOverview(MODEL, BRAND);
        
        car.setCarOverview(CAR_OVERVIEW); 
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(car), CAR_OVERVIEW);
    }

    /**
     * Test of setRegistrationNumber method, of class Car.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
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
     * Test of getRegistrationNumber method, of class Car.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testGetRegistrationNumber() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getRegistrationNumber");
        final String REGISTRATION_NUMBER = "ourRegistrationNumber";
        final String FIELD_NAME = "registrationNumber";
        final Field field = car.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(car, REGISTRATION_NUMBER);
        final String RESULT = car.getRegistrationNumber();

        assertEquals("Pola nie pasują", RESULT, REGISTRATION_NUMBER);
    }

    /**
     * Test of toString method, of class Car.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        final String EXPECTED_RESULT=String.format("Marka %s model %s numer rejestracyjny %s dane kierowcy %s", car.getCarOverview().getBrand(), car.getCarOverview().getModel(), car.getRegistrationNumber(), car.getDriver().toString());
        
        final String RESULT=car.toString();
        
        assertEquals("Pola nie pasują", RESULT, EXPECTED_RESULT);
    }
    
    /**
     * Test of equals method, of class CarOverview.
     */
    @Test
    public void testTheSameEquals() {
        System.out.println("equals");
        CarOverview carOverview = new CarOverview("Opel", "Astra");
        Employee driver = new Employee("Jan", "Nowak");
        final String REGISTRATION_NUMBER="WPI1234A";
        Car obj = new Car(carOverview,REGISTRATION_NUMBER, driver);
        Car instance = new Car(carOverview,REGISTRATION_NUMBER, driver);
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
        CarOverview carOverview1 = new CarOverview("Opel", "Astra");
        CarOverview carOverview2 = new CarOverview("Skoda", "Fabia");
        Employee driver1 = new Employee("Jan", "Nowak");
        Employee driver2 = new Employee("Andrzej", "Kowalski");
        final String REGISTRATION_NUMBER1="WPI1234A";
        final String REGISTRATION_NUMBER2="SO9876Z";
        Car obj = new Car(carOverview1,REGISTRATION_NUMBER1, driver1);
        Car instance = new Car(carOverview2,REGISTRATION_NUMBER2, driver2);
        final boolean EXPECTED_RESULT = false;
        
        final boolean RESULT = instance.equals(obj);
        
        assertEquals("Obiekty, nie są tożsame", EXPECTED_RESULT, RESULT);
    }
}