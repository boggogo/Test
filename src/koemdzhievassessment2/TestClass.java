package koemdzhievassessment2;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

/**
 * This class tests the functionality of the other classes
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 15.11.2014
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlickerNetClub fnc = new FlickerNetClub();
        Movie m1 = new Movie("15", "Avatar", 3, false);
        Movie m2 = new Movie("18", "Tron", 1, false);
        Movie m3 = new Movie("14", "The notebook", 3, false);
        Movie m4 = new Movie("15","The Immitation Game",5,false);
        Sport s1 = new Sport("Bulgaria Greats", 20, true);
        BoxSet bs1 = new BoxSet(2, "Breaking Bad", 15, true);
        BoxSet bs2 = new BoxSet(5,"Alf",14,true);

        Customer c1 = new Customer("X-Man");
        Customer c2 = new Customer("Mariya");
        Customer c3 = new Customer("Bon");
        Customer c4 = new Customer("alison");
        Customer c5 = new Customer("Rado");
        Customer c6 = new Customer("Zina");
        Customer c7 = new Customer("Sonq");
        Customer c8 = new Customer("Peter");
        Customer c9 = new Customer("Katrina");
        Customer c10 = new Customer("Harry");
        Customer c11 = new Customer("atanas");
        Customer c12 = new Customer("Nasko");
        Customer c13 = new Customer("Deen");
        Customer c14 = new Customer("Moni");
        Customer c15 = new Customer("Badas");
        Customer c16 = new Customer("Qeen");
        Customer c17 = new Customer("Jake");
        Customer c18 = new Customer("Frank");
        Customer c19 = new Customer("Tomas");
        Customer c20 = new Customer("Lorn");

        c1.addMediaItem(new Sport(("Aberdeen Finals")));
        c1.addMediaItem(m1);
        c1.addMediaItem(m2);
        System.out.println(c1.markAsReturned("Avatar"));
        System.out.println(c1.totalFinesCost());

        c1.addMediaItem(m1);
        c1.addMediaItem(s1);
        c1.addMediaItem(bs2);
        c2.addMediaItem(m3);
        //c2.addMediaItem(m4);
        //c3.addMediaItem(m2);
        //c4.addMediaItem(m2);
        c5.addMediaItem(m2);
        c6.addMediaItem(m2);
        c7.addMediaItem(m2);
        c8.addMediaItem(m2);
        c9.addMediaItem(m2);
        c10.addMediaItem(m2);
        c11.addMediaItem(m2);
        c12.addMediaItem(m2);
        c13.addMediaItem(m2);
        c14.addMediaItem(m2);
        c15.addMediaItem(m2);
        c16.addMediaItem(m2);
        c17.addMediaItem(m2);
        c18.addMediaItem(m2);
        c19.addMediaItem(m2);
        c20.addMediaItem(m2);
        //c2.addMediaItem(bs1);
        //c2.totalFinesCost();
        fnc.addCustomer(c1);
        fnc.addCustomer(c2);
        fnc.addCustomer(c3);
        fnc.addCustomer(c4);
        fnc.addCustomer(c5);
        fnc.addCustomer(c6);
        fnc.addCustomer(c7);
        fnc.addCustomer(c8);
        fnc.addCustomer(c9);
        fnc.addCustomer(c10);
        fnc.addCustomer(c11);
        fnc.addCustomer(c12);
        fnc.addCustomer(c13);
        fnc.addCustomer(c14);
        fnc.addCustomer(c15);
        fnc.addCustomer(c16);
        fnc.addCustomer(c17);
//        fnc.addCustomer(c18);
//       fnc.addCustomer(c19);
//        fnc.addCustomer(c20);

        //System.out.println("BEFORE SORT METHOD");
        //System.out.println(fnc.toString());
        //System.out.println("AFTER SORT METHOD");
        //c1.sortMediaItems();
        fnc.readFile(new File("flickernet.txt"));
        fnc.writeFile(new File("flickernet.txt"));
        fnc.readFile(new File("flickernet.txt"));
        fnc.sortCustomersByName();
        //System.out.println(fnc.getCustomerAtIndex(19).getName());
        //fnc.writeFile(new File("writeFile.txt"));
        //fnc.readFile(new File("writeFile.txt"));
        System.out.println(fnc.toPrint());
        System.out.println(fnc.getNumOfRegisCustomers());
        //System.out.println(fnc.getNumOfRegisCustomers());
        //System.out.println(fnc.getOverDueCustomers());
        //System.out.println("_____________");
        //System.out.println(fnc.getLargestTotalFinesCustomer().getName());
    }

}
