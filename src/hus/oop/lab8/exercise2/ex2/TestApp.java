package hus.oop.lab9.exercise2.ex2;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBookMap();
        phoneBook.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        phoneBook.addPerson(new Student("Marco", "Rizzo", "45243"));
        phoneBook.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(phoneBook.searchByName("Marco"));
        System.out.println(phoneBook.searchByLastname("Poppi"));

        System.out.println(phoneBook.searchByNumber("1111"));

        phoneBook.deleteByNumber("24564");
        System.out.println(phoneBook.searchByLastname("Poppi"));
    }
}
