package koemdzhievassessment2;

/**
 * This class extends the MediaItem class and it will store information about
 * Sport objects, it has no field variables (except the inherited ones from
 * MediaItem class)
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 15.11.14
 */
public class Sport extends MediaItem {

    /**
     * Constructor with one parameter that initialize the inherited variables
     *
     * @param itemDescription the description of the item (title)
     */
    public Sport(String itemDescription) {
        super(itemDescription);
    }

    /**
     * Constructor with three parameters that initialize the inherited variables
     *
     * @param itemDescription the description of the item (title)
     * @param startDay the day that the item is borrowed
     * @param ifReturned a boolean value indicating if the item is returned
     */
    public Sport(String itemDescription, int startDay, boolean ifReturned) {
        super(itemDescription, startDay, ifReturned);
    }

    /**
     * isOverDue inherited method that just returns false (sports items can be
     * borrowed indefinitely)
     *
     * @return boolean value
     */
    @Override
    public boolean isOverDue() {
        return false;
    }

    /**
     * Method to calculate fines for Sport objects
     *
     * @return double value
     */
    @Override
    public double getFines() {
        return 0.0;
    }

    /**
     * compare method, part of the Comparator interface to compare two MediaItem
     * objects
     *
     * @param o1 MediaItem object
     * @param o2 MediaItem object
     */
    @Override
    public int compare(MediaItem o1, MediaItem o2) {
        if (o2.getStartDay() > o1.getStartDay()) {
            return 1;
        } else if (o2.getStartDay() < o1.getStartDay()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * toPrint method that formats the details of the Sport object appropriately
     * for file handling
     *
     * @return String containing all of the details in appropriate format
     */
    @Override
    public String toPrint() {
        return "S," + this.getItemDescription() + "," + this.getStartDay() + "," + this.getIfReturned();
    }

    /**
     * toString method to display the all of the information about an item
     */
    @Override
    public String toString() {
        String temp = "Sport:" + this.getItemDescription() + " was loaned on day " + this.getStartDay();
        temp += " and has been " + (this.getIfReturned() == true ? "returned" : "not returned");
        return temp;
    }

}
