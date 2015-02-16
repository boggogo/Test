package koemdzhievassessment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is part of a rental club database program that will store an Array
 * of customers,the day that the club was found and the number of customers that
 * have been registered
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 12.11.2014
 */
public class FlickerNetClub {

    private Customer[] customers;
    public static int currentDay;
    private int numberOfRegCustomers;

    /**
     * Default Constructor that will initialize the local variables
     */
    public FlickerNetClub() {
        this.customers = new Customer[20];
        currentDay = 0;
        numberOfRegCustomers = 0;
    }

    /**
     * Getter method that returns the number of registered customers in the club
     *
     * @return number of registered customers
     * @version 1.0
     * @since 13.11.14
     */
    public int getNumOfRegisCustomers() {
        return this.numberOfRegCustomers;
    }

    /**
     * Modifier method that increments the currentDay field variable
     */
    public void incrementCurrentDay() {
        this.currentDay++;
    }

    /**
     * Setter method that will set the current day field to a specific value
     *
     * @param other value to set the day
     */
    public void setCurrentDay(int other) {
        this.currentDay = other;
    }

    /**
     * Getter method that returns a Customer at a specific position in the array
     * of customers
     *
     * @param index integer value that will specify the customer(position) to be
     * returned
     * @return a Customer object
     */
    public Customer getCustomerAtIndex(int index) {
        return this.customers[index];
    }

    /**
     * Modifier method that takes a Customer object as a parameter and adds it
     * to the array of customers
     *
     * @param c Customer object to be added to the array of customers
     * @return boolean value signifying weather the operation was successful or
     * not
     */
    public boolean addCustomer(Customer c) {
        if (this.numberOfRegCustomers <= 19) {
            this.customers[this.numberOfRegCustomers] = c;
            this.numberOfRegCustomers++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * A getter method that will iterate through the array of customers and
     * invoke totalFinesCost method on them. If a customer has any fines due it
     * will store the customer to a temporary String variable
     *
     * @return temp value containing every customer that owns money to the club
     */
    public String getOverDueCustomers() {
        String temp = "";
        for (int i = 0; i < this.customers.length; i++) {
            if (customers[i] != null) {
                if (customers[i].totalFinesCost() > 0.0) {
                    temp += customers[i].toString();

                }//end of if
            }//end of if
        }//end of for
        return temp;
    }

    /**
     * Getter method that will iterate through all customers and check if they
     * own money
     *
     * @return tempCustomerFines the total amount of money that all customers
     * own to the club
     */
    public Customer getLargestTotalFinesCustomer() {
        double tempCustomerFines = this.customers[0].totalFinesCost();
        int index = 0;
        for (int i = 0; i < this.customers.length; i++) {
            if (customers[i] != null) {
                if (customers[i].totalFinesCost() > tempCustomerFines) {
                    tempCustomerFines = customers[i].totalFinesCost();
                    index = i;
                }//end of if
            }//end of if
        }//end of for
        return this.getCustomerAtIndex(index);
    }

    /**
     * Method to sort the array of customers by name (Upper or down case
     * characters)
     *
     */
    public void sortCustomersByName() {
        //Arrays.sort(this.customers);
        Customer[] temp = new Customer[this.numberOfRegCustomers];
        for(int i=0;i<this.numberOfRegCustomers;i++){
            temp[i] = this.customers[i];
        }
        Arrays.sort(temp);
        
        for(int j=0;j<this.numberOfRegCustomers;j++){
            this.customers[j] = temp[j];
        }
        
    }

    /**
     * File handling method that will read a file object and store the
     * information into the array of customer
     *
     * @param f File object
     */
    public void readFile(File f) {
        try {
            Scanner sc = new Scanner(f);
            sc.useDelimiter(",|\n");
            while (sc.hasNext()) {
                int numOfCustomers = sc.nextInt();
                int currentDate = sc.nextInt();
                System.out.println("Current date:" + currentDate);
                this.setCurrentDay(currentDate);

                for (int i = 0; i < numOfCustomers; i++) {
                    String custName = sc.next();
                    int numOfItemsBorrowing = sc.nextInt();

                    Customer temp = new Customer(custName);
                    this.addCustomer(temp);
                    for (int j = 0; j < numOfItemsBorrowing; j++) {
                        String typeOfItem = sc.next();
                        if (typeOfItem.charAt(0) == 'M') {
                            String description = sc.next();
                            int startDate = sc.nextInt();
                            boolean ifReturned = sc.nextBoolean();
                            String certificate = sc.next();

                            temp.addMediaItem(new Movie(certificate, description, startDate, ifReturned));

                        } else if (typeOfItem.charAt(0) == 'S') {
                            String description = sc.next();
                            int startDate = sc.nextInt();
                            boolean ifReturned = sc.nextBoolean();

                            temp.addMediaItem(new Sport(description, startDate, ifReturned));

                        } else if (typeOfItem.charAt(0) == 'B') {
                            String description = sc.next();
                            int startDate = sc.nextInt();
                            boolean ifReturned = sc.nextBoolean();
                            int numOfDiscs = sc.nextInt();

                            temp.addMediaItem(new BoxSet(numOfDiscs, description, startDate, ifReturned));

                        }//end of else if
                    }//end of inner for loop

                }//end of outer for loop
            }//end of while
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * File handling method that will take a file as a parameter and write the
     * information of every customer object into the file
     *
     * @param f File object to be write on
     */
    public void writeFile(File f) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(this.getNumOfRegisCustomers() + "," + this.currentDay);
            bw.write("\n");

            for (int i = 0; i < this.getNumOfRegisCustomers(); i++) {
                bw.write(this.customers[i].toPrint());
            }
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that will prepare the information in the customers array for file
     * handling
     *
     * @return temp String value containing all of the information of the
     * registered customers in an appropriate format
     */
    public String toPrint() {
        String temp = "";
        for (Customer c : this.customers) {
            if (c != null) {
                temp += c.toPrint() + "\n";

            }//end of if
        }//end of for
        return temp;
    }

    /**
     * toString method that iterate through the array of of customers and invoke
     * the toString method on them
     *
     * @return temp String value containing all of the details of all registered
     * customers
     */
    @Override
    public String toString() {
        String temp = "";
        for (Customer c : this.customers) {
            if (c != null) {
                temp += c.toString() + "\n";

            }
        }
        return temp;
    }

}
