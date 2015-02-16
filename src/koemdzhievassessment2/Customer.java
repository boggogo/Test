package koemdzhievassessment2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * A Customer class that implements the Comparable interface, which we need to
 * compare customer objects The class have two field variables, the name of the
 * customer and an arrayList of MediaItems
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 13.11.14
 */
public class Customer implements Comparable<Customer> {

    private String name;
    private ArrayList<MediaItem> mediaItems;

    /**
     * Constructor that will initialize the field variables
     *
     * @param name the name of the customer
     *
     */
    public Customer(String name) {
        this.name = name;
        mediaItems = new ArrayList<MediaItem>();
    }

    /**
     * Getter method that returns the name of the customer
     *
     * @return name field variable
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for the the mediaItems field arrayList
     *
     * @return mediaItems arrayList of MediaItems objects
     */
    public ArrayList<MediaItem> getMediaItems() {
        return mediaItems;
    }

    /**
     * Modifier method that takes MeriaItem object and adds it to the arrayList
     * mediaItems
     *
     * @param mi MediaItem object
     */
    public void addMediaItem(MediaItem mi) {
        this.mediaItems.add(mi);
    }

    /**
     * Modifier method that will mark a MediaItem object as returned. It will
     * return a String result containing information about weather the MediaItem
     * object has any fines due
     *
     * @param description the description of the movie(i.e. Title)
     * @return temp String value that contains information weather the item has
     * been found, and if yes - are there fines due
     */
    public String markAsReturned(String description) {
        String temp = "";
        for (int i = 0; i < this.mediaItems.size(); i++) {
            if (mediaItems.get(i).getItemDescription().equals(description)) {
                mediaItems.get(i).setReturned(true);
                temp += "The Item has been returned! ";
                temp += "\nOverdue charge: " + mediaItems.get(i).getFines();
            }//end of if
        }//end of for loop
        if (temp.equals("")) {
            temp += "Item has been not found!";
        }//end of if
        return temp;
    }

    /**
     * A method that will iterate through all MediaItem objects and calculate
     * the total amount of fines
     *
     * @return temp value containing to total amount of fines
     */
    public double totalFinesCost() {
        double temp = 0.0;
        for (MediaItem mi : mediaItems) {
            temp += mi.getFines();
        }//end of for loop
        return temp;
    }

    /**
     * A method that will sort the mediaItems arrayList by the day that they
     * have been borrowed
     *
     */
    public void sortMediaItems() {
        this.mediaItems.sort(new MediaComparator());
    }

    /**
     * Method that will compare Customers by their name, ignoring the letters
     * Case
     *
     * @param that
     * @return intValue
     */
    @Override
    public int compareTo(Customer that) {
        return this.name.compareToIgnoreCase(that.getName());

    }

    /**
     * Method that will format the information of all customers array and all
     * mediaItems arrayList for file handling
     *
     * @return temp String value containing all of the information of the
     * registered customers and all of their borrowing MediaItem objects in an
     * appropriate format
     */
    public String toPrint() {
        String temp = this.name + "," + this.mediaItems.size() + "\n";
        for (MediaItem mi : mediaItems) {
            temp += mi.toPrint() + "\n";
        }//end of for
        return temp;
    }

    /**
     * toString method to display all of the information of every customer and
     * the MetiaItems object that they are borrowing
     *
     * @return temp String value containing all of the information about a
     * Customer object, including the MetiaItem objects borrowing
     */
    @Override
    public String toString() {
        String temp = this.name + "," + this.mediaItems.size() + "\n";
        for (MediaItem mi : mediaItems) {
            temp += mi.toString() + "\n";
        }//end of for
        return temp;
    }

}
