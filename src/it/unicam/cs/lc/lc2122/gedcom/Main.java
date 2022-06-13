package it.unicam.cs.lc.lc2122.gedcom;

public class Main {
    public static void main(String[] args) throws Exception {
        AncestorsDescendantsCalculator calculator = new AncestorsDescendantsCalculator(args);
        calculator.execute();
    }
}
