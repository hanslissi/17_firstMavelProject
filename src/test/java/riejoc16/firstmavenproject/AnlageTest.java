/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riejoc16.firstmavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johannesriedmueller
 */
public class AnlageTest {
    
    public AnlageTest() {
    }

    /**
     * Test of jahresAfa method, of class Anlage.
     */
    @org.junit.Test
    public void testJahresAfa() {
        Anlage anlage = new Anlage(2000.0, 10);
        assertEquals(200.0, anlage.jahresAfa(),0.01);
    }
    
    @org.junit.Test
    public void testUpdateBuchwert(){
        Anlage anlage = new Anlage(2000.0,10);
        anlage.updateBuchwert(5);
        assertEquals(1000.0, anlage.getBuchwert(),0.01);
    }
    
    @org.junit.Test
    public void testGetBuchwert(){
        Anlage anlage = new Anlage(2000.0,10);
        anlage.updateBuchwert(10);
        assertEquals(1.0, anlage.getBuchwert(),0.01);
    }
    
    
}
