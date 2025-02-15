package hus.oop.lab4.customerandinvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount) {
        this.id=id;
        this.amount=amount;
        this.customer=customer;
    }
    public double getAmount() {
        return amount;
    }
    public Customer getCustomer() {
        return customer;
    }
    public int getID() {
        return id;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getCustomerID() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        amount = amount*(100-customer.getDiscount())/100;
        return amount;
    }
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}

