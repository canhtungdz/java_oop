package hus.oop.lab4.exercise2.authorandbookadvanced;

public class Book extends Author{
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    public Book() {
    }
    public Book(String name, Author[] authors, double price) {
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {
        String res = "Book[name=" + name + ",author={" ;
        for (int i = 0; i < authors.length-1; i++) {
            res+=authors[i].toString() + ",";
        }
        res+=authors[authors.length-1].toString() + "}";
        res+=",price=" + price + ",qty=" + qty + "]";
        return res;
    }
    public String getAuthorNames() {
        String res = "";
        for (int i = 0; i < authors.length-1; i++) {
            res+= authors[i].getName() + ",";
        }
        res+=authors[authors.length-1];
        return res;
    }

}

