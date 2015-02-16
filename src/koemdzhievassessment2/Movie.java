package koemdzhievassessment2;

/**
 * This class extends the MediaItem class and it will store information about
 * Movie objects, it has only one field variable (except the inherited ones from
 * MediaItem class)
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 13.11.14
 */
public class Movie extends MediaItem {

    private String certificate;

    /**
     * Constructor with two parameters for new customers to initialize the field
     * variables of the super class and this class
     *
     * @param certificate the certificate of the movie as a String
     * @param itemDescription the description of the movie (i.e.the title)
     */
    public Movie(String certificate, String itemDescription) {
        super(itemDescription);
        this.certificate = certificate;
    }

    /**
     * Constructor with 4 parameters to initialize the field variables of the
     * super class and this class
     *
     * @param certificate the certificate of the movie as a String
     * @param itemDescription the description of the movie (i.e.the title)
     * @param startDay the start day of the rent
     * @param ifReturned boolean value representing if the item has been
     * returned or not
     */
    public Movie(String certificate, String itemDescription, int startDay, boolean ifReturned) {
        super(itemDescription, startDay, ifReturned);
        this.certificate = certificate;
    }

    /**
     * Getter method for the field variable certificate
     *
     * @return certificate the certificate that the movie has
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Method to check if the item is over due.
     *
     * @return boolean value
     */
    @Override
    public boolean isOverDue() {
        if (this.getStartDay() > 2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method that calculates the fines of an item based on the isOverDue method
     *
     * @return double value - the fines of an Item
     */
    @Override
    public double getFines() {
        if (this.isOverDue()) {
            return (this.getStartDay() - 2) * 2.5;
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
     * toPrint method that formats the details of the movie for file handling
     * purposes
     *
     * @return String variable
     */
    @Override
    public String toPrint() {
        return "M," + this.getItemDescription() + "," + this.getStartDay() + "," + this.getIfReturned() + "," + this.getCertificate();
    }

    /**
     * toString method that presents all of the details of the movie objects
     *
     * @return temp String variable
     */
    @Override
    public String toString() {
        String temp = "Movie:" + this.getItemDescription() + " (Cert " + this.certificate + ")" + " was loaned on day " + this.getStartDay();
        temp += " and has been " + (this.getIfReturned() == true ? "returned" : "not returned");
        return temp;
    }

}
