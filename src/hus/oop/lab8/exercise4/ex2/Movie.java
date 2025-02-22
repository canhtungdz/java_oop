package hus.oop.lab8.exercise4.ex2;

import java.lang.Comparable;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
