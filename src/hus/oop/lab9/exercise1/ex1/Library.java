package hus.oop.lab9.exercise1.ex1;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }
    public Rent getLongestRent() {
        // Iterate through rents and find the one with the longest duration
        Rent longestRent = null;
        for (Rent rent : rents) {
            if (longestRent == null || rent.getEnd().getTime() - rent.getBegin().getTime()
                    > longestRent.getEnd().getTime() - longestRent.getBegin().getTime()) {
                longestRent = rent;
            }
        }
        return longestRent;
    }
}
