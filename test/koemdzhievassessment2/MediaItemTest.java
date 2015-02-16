/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koemdzhievassessment2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koemdzhiev
 */
public class MediaItemTest {
    
    public MediaItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getItemDescription method, of class MediaItem.
     */
    @Test
    public void testGetItemDescription() {
        System.out.println("getItemDescription");
        MediaItem instance = new Movie("12","The words");
        String expResult = "The words";
        String result = instance.getItemDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStartDay method, of class MediaItem.
     */
    @Test
    public void testGetStartDay() {
        System.out.println("getStartDay");
        MediaItem instance = new Movie("14","People like us",6,true);
        int expResult = 6;
        int result = instance.getStartDay();
        assertEquals(expResult, result);

    }

    /**
     * Test of getIfReturned method, of class MediaItem.
     */
    @Test
    public void testGetIfReturned() {
        System.out.println("getIfReturned");
        MediaItem instance = new Movie("16","Beautiful Creatures",1,false);
        boolean expResult = false;
        boolean result = instance.getIfReturned();
        assertEquals(expResult, result);

    }

    /**
     * Test of setReturned method, of class MediaItem.
     */
    @Test
    public void testSetReturned() {
        System.out.println("setReturned");
        boolean ifReturned = false;
        MediaItem instance = new Movie("15","The Lorax",2,true);
        instance.setReturned(ifReturned);
        
        boolean expResult = false;
        boolean result = instance.getIfReturned();
        assertEquals(expResult,result);

    }

    /**
     * Test of isOverDue method, of class MediaItem.
     */
    @Test
    public void testIsOverDue() {
        System.out.println("isOverDue");
        MediaItem instance = new Movie("10","Mirror Mirror",4,false);
        boolean expResult = true;
        boolean result = instance.isOverDue();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFines method, of class MediaItem.
     */
    @Test
    public void testGetFines() {
        System.out.println("getFines");
        MediaItem instance = new Movie("15","The lucky one",3,false);
        double expResult = 2.5;
        double result = instance.getFines();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of toPrint method, of class MediaItem.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        MediaItem instance = new Movie("16","Colombiana",3,true);
        String expResult = "M,Colombiana,3,true,16";
        String result = instance.toPrint();
        assertEquals(expResult, result);

    }

    
}
