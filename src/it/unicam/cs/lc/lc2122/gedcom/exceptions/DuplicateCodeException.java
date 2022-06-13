package it.unicam.cs.lc.lc2122.gedcom.exceptions;

/**
 * Thrown when a GEDCOM application attempts to use a tag with a CODE in a
 * case where it is not permitted have multiple CODE occurrences.
 *
 * @author Piermichele Rosati
 */
public class DuplicateCodeException extends RuntimeException {

    /**
     * Creates an {@link DuplicateCodeException} with specified message.
     *
     * @param message the message for this exception
     */
    public DuplicateCodeException(String message) {
        super(message);
    }
}
