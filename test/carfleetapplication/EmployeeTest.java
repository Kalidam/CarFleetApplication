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
public class EmployeeTest {
    
    private Employee employee;
    
    @Before
    public void setUp() {
        String name="Andrzej";
        String surname="Nowak";
        employee=new Employee(name,surname);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setName");
        final String NAME = "ourname";
        final String FIELD_NAME = "name";
        
        employee.setName(NAME); 
        final Field field = employee.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(employee), NAME);
    }

    /**
     * Test of setSurname method, of class Employee.
     */
    @Test
    public void testSetSurname() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("setSurname");
        final String SURNAME = "ourname";
        final String FIELD_NAME = "name";
        
        employee.setSurname(SURNAME); 
        final Field field = employee.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        assertEquals("Pola nie pasują", field.get(employee), SURNAME);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getName");
        final String NAME = "ourmname";
        final String FIELD_NAME = "name";
        final Field field = employee.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(employee, NAME);
        final String result = employee.getName();

        assertEquals("Pola nie pasują", result, NAME);
    }

    /**
     * Test of getSurname method, of class Employee.
     */
    @Test
    public void testGetSurname() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("getSurname");
        final String SURNAME = "oursurname";
        final String FIELD_NAME = "surname";
        final Field field = employee.getClass().getDeclaredField(FIELD_NAME);
        field.setAccessible(true);
        
        field.set(employee, SURNAME);
        final String result = employee.getSurname();

        assertEquals("Pola nie pasują", result, SURNAME);
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
