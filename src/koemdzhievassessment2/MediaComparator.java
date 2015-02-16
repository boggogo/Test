package koemdzhievassessment2;

import java.util.Comparator;

/**
 * This abstract class implements the Comparator interface in order to allow us
 * to compare MediaItem objects.
 *
 * @author Georgi Koemdzhiev
 * @version 1.0
 * @since 15.11.14
 */
public class MediaComparator implements Comparator<MediaItem> {

    /**
     * Method to compare two MediaItem objects by the start rental day in
     * descending order
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

}
