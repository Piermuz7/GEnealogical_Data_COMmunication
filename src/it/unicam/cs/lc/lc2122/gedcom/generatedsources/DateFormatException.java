package it.unicam.cs.lc.lc2122.gedcom.generatedsources;

public class DateFormatException extends RuntimeException {
    public DateFormatException(String message) {
        super("Wrong date format: " + message);
    }
}
