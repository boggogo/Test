package koemdzhievassessment2;

import java.util.Comparator;

/**
 * This abstract class implements the Comparator interface in order to allow us
 * to compare MediaItem objects, the class has three field variables:
 * itemDescripton:String,startDay:integer,returned:boolean
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 13.11.14
 */
public abstract class MediaItem implements Comparator<MediaItem> {

    private String itemDescription;
    private int startDay;
    private boolean returned;

    /**
     * Constructor with one parameter, that is used for new customers it takes a
     * String as a parameter and initializes all of the field variables
     *
     * @param itemDescription the description of the item(i.e Title)
     */
    public MediaItem(String itemDescription) {
        this.itemDescription = itemDescription;
        this.startDay = 0;
        this.returned = false;
    }

    /**
     * Constructor with three parameters and initializes the field variables
     *
     * @param itemDescription the description of the item(i.e Title)
     * @param startDay the day that the item is borrowed
     * @param ifReturned boolean value indicating if the item is returned or not
     */
    public MediaItem(String itemDescription, int startDay, boolean ifReturned) {
        this.itemDescription = itemDescription;
        this.startDay = startDay;
        this.returned = ifReturned;
    }

    /**
     * Getter method that will return the description of the MediaItem object
     *
     * @return itemDescription the description of the MediaItemObject (i.e.
     * Title)
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Getter method for the field variable startDay variable containing the
     * start day of the borrowing
     *
     * @return startDay integer variable
     */
    public int getStartDay() {
        return startDay;
    }

    /**
     * Getter method for the field variable returned that describes the item as
     * returned or not returned
     *
     * @return returned a boolean variable
     */
    public boolean getIfReturned() {
        return returned;
    }

    /**
     * Setter method for the field variable returned
     *
     * @param ifReturned boolean variable
     */
    public void setReturned(boolean ifReturned) {
        this.returned = ifReturned;
    }

    /**
     * Abstract method that will be inherited by all of the MediaItem subclasses
     * The method calculates if an MediaItem is over due or not
     *
     * @return boolean value
     */
    public abstract boolean isOverDue();

    /**
     * Abstract method that will be inherited by all of the MediaItem subclasses
     * The method calculates MediaItem's fines due based on the isOverDue method
     * 
     * @return double value
     */
    public abstract double getFines();

    /**
     * Abstract method that will be inherited by all of the MediaItem subclasses
     *
     * @return String with appropriate format for File handling
     */
    public abstract String toPrint();
}
