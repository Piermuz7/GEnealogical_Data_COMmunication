package it.unicam.cs.lc.lc2122.gedcom;

public class IllegalCodeException extends RuntimeException{

    public IllegalCodeException(String message) {
        super("Nonexistent CODE: "+message);
    }
}
