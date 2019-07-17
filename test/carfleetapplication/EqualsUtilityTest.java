/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damian
 */
public class EqualsUtilityTest {
    
    /**
     * Test of areObjectsEqual method, of class EqualsUtility.
     */
    @Test
    public void testAreTwoNullsEqual() {
        System.out.println("areTwoNullsEqual");
        final Object TYPE1 = null;
        final Object TYPE2 = null;
        final boolean EXPECTED_RESULT = true;
        
        final boolean RESULT = EqualsUtility.areObjectsEqual(TYPE1, TYPE2);
        
        assertEquals("Obiekty, które są nullami nie są tożsame",EXPECTED_RESULT, RESULT); 
    }
    
    /**
     * Test of areObjectsEqual method, of class EqualsUtility.
     */
    @Test
    public void testAreTwoStringsEqual() {
        System.out.println("areTwoStringsEqual");
        final Object TYPE1 = new String("The same object");
        final Object TYPE2 = new String("The same object");
        final boolean EXPECTED_RESULT = true;
        
        final boolean RESULT = EqualsUtility.areObjectsEqual(TYPE1, TYPE2);
        
        assertEquals("Obiekty, które są dwoma Stringami nie są tożsame",EXPECTED_RESULT, RESULT); 
    }
    
    /**
     * Test of areObjectsEqual method, of class EqualsUtility.
     */
    @Test
    public void testAreOneNullEqual() {
        System.out.println("areOneNullEqual");
        final Object TYPE1 = null;
        final Object TYPE2 = new String("Different object");
        final boolean EXPECTED_RESULT = false;
        
        final boolean RESULT = EqualsUtility.areObjectsEqual(TYPE1, TYPE2);
        
        assertEquals("Obiekty, który jeden jest nullem a drugim Stringiem nie są tożsame",EXPECTED_RESULT, RESULT); 
    }
    
    /**
     * Test of areObjectsEqual method, of class EqualsUtility.
     */
    @Test
    public void testAreDifferentObjectsEqual() {
        System.out.println("areDifferentObjectsEqual");
        final Object TYPE1 = new Integer(3);
        final Object TYPE2 = new String("Three");
        final boolean EXPECTED_RESULT = false;
        
        final boolean RESULT = EqualsUtility.areObjectsEqual(TYPE1, TYPE2);
        
        assertEquals("Obiekty, które są róznymi obiektami nie są tożsame",EXPECTED_RESULT, RESULT); 
    }
}
