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
public class MovieTest {
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCertificate method, of class Movie.
     */
    @Test
    public void testGetCertificate() {
        System.out.println("getCertificate");
        Movie instance = new Movie("15","The Immitation Game",5,false);
        String expResult = "15";
        String result = instance.getCertificate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isOverDue method, of class Movie.
     */
    @Test
    public void testIsOverDue() {
        System.out.println("isOverDue");
        Movie instance = new Movie("15","The Immitation Game",5,false);
        boolean expResult = true;
        boolean result = instance.isOverDue();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFines method, of class Movie.
     */
    @Test
    public void testGetFines() {
        System.out.println("getFines");
        Movie instance = new Movie("15","The Immitation Game",5,false);
        double expResult = 7.5;
        double result = instance.getFines();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of compare method, of class Movie.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        MediaItem o1 = new Movie("15","Hunger Games",5,false);
        MediaItem o2 = new Sport("Bulgaria finals",10,true);
        Movie instance = new Movie("15","The Immitation Game",5,false);
        int expResult = 1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of toPrint method, of class Movie.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Movie instance = new Movie("15","The Immitation Game",5,false);
        String expResult = "M,The Immitation Game,5,false,15";
        String result = instance.toPrint();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Movie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Movie instance = new Movie("15","The Immitation Game",5,false);
        String expResult = "Movie:The Immitation Game (Cert 15) was loaned on day 5 and has been not returned";
        String result = instance.toString();
        assertEquals(expResult, result);
     
    }
    
}
