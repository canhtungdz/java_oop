package hus.oop.lab4.Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        int new_salary = salary + (int)salary*percent/100;
        setSalary(salary + (int)salary*percent/100);
        return new_salary;
    }

    @Override
    public String toString() {
        return "Emplayee[id=" + id +
                ",name=" + firstName + " " + lastName +
                ",salary=" + salary + "]";
    }
}
