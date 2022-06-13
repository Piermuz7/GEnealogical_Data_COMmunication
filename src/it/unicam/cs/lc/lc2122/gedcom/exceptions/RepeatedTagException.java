package it.unicam.cs.lc.lc2122.gedcom.exceptions;

/**
 * Thrown when a GEDCOM application attempts to use a tag in a
 * case where it is not permitted have multiple occurrences of that tag.
 *
 * @author Piermichele Rosati
 */
public class RepeatedTagException extends RuntimeException {

    /**
     * Creates a {@link RepeatedTagException} with the repeated tag.
     *
     * @param tag the repeated tag.
     */
    public RepeatedTagException(String tag) {
        super("Repeated tag: " + tag);
    }
}
