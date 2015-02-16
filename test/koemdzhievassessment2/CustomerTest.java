/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koemdzhievassessment2;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koemdzhiev
 */
public class CustomerTest {

    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer("Testy");
        String expResult = "Testy";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMediaItems method, of class Customer.
     */
    @Test
    public void testGetMediaItems() {
        System.out.println("getMediaItems");
        Customer instance = new Customer("Testy");
        ArrayList<MediaItem> mediaItems = new ArrayList<MediaItem>();
        instance.addMediaItem((new Movie("16", "Avatar")));
        String result = instance.getMediaItems().toString();
        String expResult = "[Movie:Avatar (Cert 16) was loaned on day 0 and has been not returned]";
        assertEquals(expResult, result);

    }

    /**
     * Test of addMediaItem method, of class Customer.
     */
    @Test
    public void testAddMediaItem() {
        System.out.println("addMediaItem");
        MediaItem mi = new Movie("14", "Titans");
        Customer instance = new Customer("Atanas");
        instance.addMediaItem(mi);

        String expResult = "Titans";
        String result = instance.getMediaItems().get(0).getItemDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of markAsReturned method, of class Customer.
     */
    @Test
    public void testMarkAsReturned() {
        System.out.println("markAsReturned");
        String description = "Love Trip";
        Customer instance = new Customer("Ivan");
        instance.addMediaItem(new Movie("18", "Love Trip"));
        String expResult = "The Item has been returned! \n"
                + "Overdue charge: 0.0";
        String result = instance.markAsReturned(description);
        System.out.println(result);
        assertEquals(expResult, result);

    }

    /**
     * Test of totalFinesCost method, of class Customer.
     */
    @Test
    public void testTotalFinesCost() {
        System.out.println("totalFinesCost");
        Customer instance = new Customer("Mario");
        double expResult = 0.0;
        double result = instance.totalFinesCost();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of sortMediaItems method, of class Customer.
     */
    @Test
    public void testSortMediaItems() {
        System.out.println("sortMediaItems");
        Customer instance = new Customer("Peter");
        instance.addMediaItem(new Movie("16", "Stary Movie", 1, false));
        instance.addMediaItem(new Movie("12", "Toy Story", 5, true));
        instance.sortMediaItems();

        String expResult = "Peter,2\n"
                + "Movie:Toy Story (Cert 12) was loaned on day 5 and has been returned\n"
                + "Movie:Stary Movie (Cert 16) was loaned on day 1 and has been not returned\n";
        String result = instance.toString();
        System.out.println(result);

        assertEquals(expResult, result);

    }

    /**
     * Test of toPrint method, of class Customer.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Customer instance = new Customer("Toni Stark");
        String expResult = "Toni Stark,0\n";
        String result = instance.toPrint();
        assertEquals(expResult, result);

    }

    /**
     * Test of compareTo method, of class Customer.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Customer that = new Customer("Abba");
        Customer instance = new Customer("Babba");
        int expResult = 1;
        int result = instance.compareTo(that);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer("Toni");
        String expResult = "Toni,0\n";
        String result = instance.toString();

        assertEquals(expResult, result);

    }

}
