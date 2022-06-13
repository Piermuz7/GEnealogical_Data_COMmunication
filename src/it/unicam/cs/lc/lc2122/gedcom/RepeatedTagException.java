package it.unicam.cs.lc.lc2122.gedcom;

/**
 * Thrown when a GEDCOM application attempts to use a tag in a
 * case where it is not permitted have multiple occurrences of that tag.
 */
public class RepeatedTagException extends RuntimeException {

    /**
     * Creates a {@link RepeatedTagException} with the repeated tag.
     *
     * @param message the repeated tag.
     */
    public RepeatedTagException(String message) {
        super("Repeated tag: " + message);
    }
}
