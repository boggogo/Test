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
public class BoxSetTest {
    
    public BoxSetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNumberOfDiscs method, of class BoxSet.
     */
    @Test
    public void testGetNumberOfDiscs() {
        System.out.println("getNumberOfDiscs");
        BoxSet instance = new BoxSet(5,"Alf");
        int expResult = 5;
        int result = instance.getNumberOfDiscs();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOverDue method, of class BoxSet.
     */
    @Test
    public void testIsOverDue() {
        System.out.println("isOverDue");
        BoxSet instance = new BoxSet(5,"Alf",14,true);
        boolean expResult = false;
        boolean result = instance.isOverDue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFines method, of class BoxSet.
     */
    @Test
    public void testGetFines() {
        System.out.println("getFines");
        BoxSet instance = new BoxSet(5,"Alf",14,true);
        double expResult = 0.0;
        double result = instance.getFines();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compare method, of class BoxSet.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        MediaItem o1 = new Sport("Bulgaria finals",10,true);
        MediaItem o2 = new Movie("18","Transformers",5,false);
        BoxSet instance = new BoxSet(5,"Alf",14,true);
        int expResult = -1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);

    }

    /**
     * Test of toPrint method, of class BoxSet.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        BoxSet instance = new BoxSet(5,"Alf",14,true);
        String expResult = "B,Alf,14,true,5";
        String result = instance.toPrint();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class BoxSet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BoxSet instance = new BoxSet(5,"Alf",14,true);
        String expResult = "BoxSet:Alf (number of Discs 5) was loaned on day 14 and has been returned";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
