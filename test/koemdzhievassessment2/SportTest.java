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
public class SportTest {
    
    public SportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isOverDue method, of class Sport.
     */
    @Test
    public void testIsOverDue() {
        System.out.println("isOverDue");
        Sport instance = new Sport("Bulgarian Finals",3,false);
        boolean expResult = false;
        boolean result = instance.isOverDue();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getFines method, of class Sport.
     */
    @Test
    public void testGetFines() {
        System.out.println("getFines");
        Sport instance = new Sport("Bulgarian Finals",3,false);;
        double expResult = 0.0;
        double result = instance.getFines();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of compare method, of class Sport.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        MediaItem o1 = new Sport("Bulgarian Finals",3,false);
        MediaItem o2 = new Movie("12","Chuck",5,false);
        Sport instance = new Sport("Bulgarian Finals",3,false);
        int expResult = 1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of toPrint method, of class Sport.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Sport instance = new Sport("Bulgarian Finals",3,false);
        String expResult = "S,Bulgarian Finals,3,false";
        String result = instance.toPrint();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of toString method, of class Sport.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sport instance = new Sport("Bulgarian Finals",3,false);
        String expResult = "Sport:Bulgarian Finals was loaned on day 3 and has been not returned";
        String result = instance.toString();
        assertEquals(expResult, result);
 
    }
    
}
