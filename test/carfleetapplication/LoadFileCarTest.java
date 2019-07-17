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
 * @author Dell
 */
public class LoadFileCarTest {
    LoadFileCar loadFileCar;
    
    @Before
    public void setUp() {
        final String NAME = "Jan";
        final String SURNAME = "Nowak";
        loadFileCar = new LoadFileCar();
    }

    /**
     * Test of checkDriver method, of class LoadFileCar.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testCheckDriver() {
        System.out.println("checkDriver");
        final String NAME = "Andrzej";
        final String SURNAME = "Nowak";
        
        loadFileCar.checkDriver(NAME, SURNAME);
    }
}
