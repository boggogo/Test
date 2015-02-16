package koemdzhievassessment2;

/**
 * This class extends the MediaItem class and it will store information about
 * BoxSet objects, it has only one field variable number of discs(except the
 * inherited ones from MediaItem class)
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 15.11.14
 */
public class BoxSet extends MediaItem {

    private int numOfDiscs;

    /**
     * Constructor with two parameters to initialize BoxSet and MediaItem (super
     * class) field variables
     *
     * @param numOfDiscs the number of discs that the BoxSet object has
     * @param itemDescription the description of the BoxSet object (title)
     */
    public BoxSet(int numOfDiscs, String itemDescription) {
        super(itemDescription);
        this.numOfDiscs = numOfDiscs;
    }

    /**
     * Constructor with four parameters to initialize BoxSet and MediaItem
     * (Super class) field variables
     *
     * @param numOfDiscs the number of discs that the BoxSet object has
     * @param itemDescription the description of the BoxSet object (title)
     * @param sartDay the day that the item is borrowed
     * @param ifReturned boolean value that indicates if the item is returned
     */
    public BoxSet(int numOfDiscs, String itemDescription, int startDay, boolean ifReturned) {
        super(itemDescription, startDay, ifReturned);
        this.numOfDiscs = numOfDiscs;
    }

    /**
     * Getter method for the field variable numOfDiscs
     *
     * @return numOfDiscs the number of discs that the BoxSet has
     */
    public int getNumberOfDiscs() {
        return this.numOfDiscs;
    }

    /**
     * Method to calculate if the BoxSet object is over due
     *
     * @return boolean value
     */
    @Override
    public boolean isOverDue() {
        if (this.getStartDay() > 14) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method to calculate the fines due based on the isOverDue method
     *
     * @return double value
     */
    @Override
    public double getFines() {
        if (this.isOverDue()) {
            return (this.getStartDay() - 14) * 1;
        } else {
            return 0.0;
        }
    }

    /**
     * Method that is part of the Comparator class and compares MeriaItems by
     * the start day of the rental.The latest date comes first - descending
     * order
     *
     * @param o1 MediaItem object
     * @param o2 MediaItem object
     * @return intValue
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
     * toPrint method that formats the details of the BoxSet object
     * appropriately for file handling
     *
     * @return String containing all of the details in appropriate format
     */
    @Override
    public String toPrint() {
        return "B," + this.getItemDescription() + "," + this.getStartDay() + "," + this.getIfReturned() + "," + this.numOfDiscs;
    }

    /**
     * toString method to display the all of the information about a BoxSet
     * object
     *
     * @return String containing all of the details of a BoxSet object
     */
    @Override
    public String toString() {
        String temp = "BoxSet:" + this.getItemDescription() + " (number of Discs " + this.numOfDiscs;
        temp += ")" + " was loaned on day " + this.getStartDay();
        temp += " and has been " + (this.getIfReturned() == true ? "returned" : "not returned");
        return temp;
    }

}
