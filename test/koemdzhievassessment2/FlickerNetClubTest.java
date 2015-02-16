/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koemdzhievassessment2;

import java.io.File;
import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koemdzhiev
 */
public class FlickerNetClubTest {

    public FlickerNetClubTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNumOfRegisCustomers method, of class FlickerNetClub.
     */
    @Test
    public void testGetNumOfRegisCustomers() {
        System.out.println("getNumOfRegisCustomers");
        FlickerNetClub instance = new FlickerNetClub();
        int expResult = 0;
        int result = instance.getNumOfRegisCustomers();
        assertEquals(expResult, result);

    }

    /**
     * Test of incrementCurrentDay method, of class FlickerNetClub.
     */
    @Test
    public void testIncrementCurrentDay() {
        System.out.println("incrementCurrentDay");
        FlickerNetClub instance = new FlickerNetClub();
        instance.incrementCurrentDay();

        int result = FlickerNetClub.currentDay;
        int expResult = 1;
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrentDay method, of class FlickerNetClub.
     */
    @Test
    public void testSetCurrentDay() {
        System.out.println("setCurrentDay");
        int other = 3;
        int expResult = 3;
        FlickerNetClub instance = new FlickerNetClub();
        instance.setCurrentDay(other);
        assertEquals(expResult, other);

    }

    /**
     * Test of getCustomerAtIndex method, of class FlickerNetClub.
     */
    @Test
    public void testGetCustomerAtIndex() {
        System.out.println("getCustomerAtIndex");
        int index = 0;
        FlickerNetClub instance = new FlickerNetClub();
        Customer expResult = new Customer("Ben");
        instance.addCustomer(expResult);
        Customer result = instance.getCustomerAtIndex(index);
        assertEquals(expResult, result);

    }

    /**
     * Test of addCustomer method, of class FlickerNetClub.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer c = new Customer("Testy");
        FlickerNetClub instance = new FlickerNetClub();
        boolean expResult = true;
        boolean result = instance.addCustomer(c);
        assertEquals(expResult, result);

    }

    /**
     * Test of getOverDueCustomers method, of class FlickerNetClub.
     */
    @Test
    public void testGetOverDueCustomers() {
        System.out.println("getOverDueCustomers");
        FlickerNetClub instance = new FlickerNetClub();
        Customer c = new Customer("Mariya");
        c.addMediaItem(new Movie("14", "The notebook", 3, false));
        instance.addCustomer(c);
        String expResult = "Mariya,1\n"
                + "Movie:The notebook (Cert 14) was loaned on day 3 and has been not returned\n"
                + "";
        String result = instance.getOverDueCustomers();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLargestTotalFinesCustoemr method, of class FlickerNetClub.
     */
    @Test
    public void testGetLargestTotalFinesCustomer() {
        System.out.println("getLargestTotalFinesCustoemr");
        FlickerNetClub instance = new FlickerNetClub();
        Customer expResult = new Customer("Don");
        instance.addCustomer(expResult);
        instance.addCustomer(new Customer("Georgi"));
        expResult.addMediaItem(new Movie("16", "Iron Man3", 10, false));
        Customer result = instance.getLargestTotalFinesCustomer();
        assertEquals(expResult, result);

    }

    /**
     * Test of sortCustomersByName method, of class FlickerNetClub.
     */
    @Test
    public void testSortCustomersByName() {
        System.out.println("sortCustomersByName");
        FlickerNetClub instance = new FlickerNetClub();

        Customer[] temp = new Customer[2];

        Customer a = new Customer("Bob");
        Customer b = new Customer("alison");
        instance.addCustomer(a);
        instance.addCustomer(b);
        for (int i = 0; i < instance.getNumOfRegisCustomers(); i++) {
            temp[i] = instance.getCustomerAtIndex(i);
        }
        Arrays.sort(temp);

        String expResult = "alison" + "Bob";
        String result = temp[0].getName() + temp[1].getName();

        assertEquals(expResult, result);

    }

    /**
     * Test of readFile method, of class FlickerNetClub.
     */
    @Test
    public void testReadFile() {
        System.out.println("readFile");
        File f = new File("flickernetTest.txt");
        FlickerNetClub instance = new FlickerNetClub();
        instance.readFile(f);
        String expResult = "Georgi";
        String result = instance.getCustomerAtIndex(0).getName();

        assertEquals(expResult, result);

    }

    /**
     * Test of writeFile method, of class FlickerNetClub.
     */
    @Test
    public void testWriteFile() {
        System.out.println("writeFile");
        File f = new File("flickernetTest.txt");
        FlickerNetClub instance = new FlickerNetClub();

        instance.readFile(f);

        String expResult = instance.getCustomerAtIndex(0).toPrint();

        instance.writeFile(f);

        instance.readFile(f);

        String result = instance.getCustomerAtIndex(0).toPrint();

        assertEquals(expResult, result);

    }

    /**
     * Test of toPrint method, of class FlickerNetClub.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        FlickerNetClub instance = new FlickerNetClub();
        Customer c = new Customer("Rihana");

        instance.addCustomer(c);

        String expResult = "Rihana" + "," + "0" + "\n";
        String result = instance.getCustomerAtIndex(0).toPrint();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class FlickerNetClub.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FlickerNetClub instance = new FlickerNetClub();
        Customer c = new Customer("X-Man");
        //c.addMediaItem(new Sport("Aberdeen Finals"));
        instance.addCustomer(c);

        String expResult = "X-Man,0"+"\n";

        String result = instance.toString();
        System.out.println(result);
        System.out.println("EXPECTED:" + expResult);
        System.out.println("RESULT:" + result);
        assertEquals(expResult, result);

    }

}
