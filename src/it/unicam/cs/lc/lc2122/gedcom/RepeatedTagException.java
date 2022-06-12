package it.unicam.cs.lc.lc2122.gedcom;

public class RepeatedTagException extends RuntimeException {

    public RepeatedTagException(String message) {
        super("Repeated tag: "+message);
    }
}
