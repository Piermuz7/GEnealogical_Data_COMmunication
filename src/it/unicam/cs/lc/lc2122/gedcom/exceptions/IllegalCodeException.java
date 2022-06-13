package it.unicam.cs.lc.lc2122.gedcom.exceptions;

/**
 * Thrown when a GEDCOM application attempts to use a nonexistent CODE.
 *
 * @author Piermichele Rosati
 */
public class IllegalCodeException extends RuntimeException {

    /**
     * Creates an {@link IllegalCodeException} with the specified nonexistent code.
     *
     * @param code the nonexistent code
     */
    public IllegalCodeException(String code) {
        super("Nonexistent CODE: " + code);
    }
}
