package hus.oop.lab6.exercise1.superclassperson;

public class TestStudent {
    public static void main(String[] args) {
        Person person1 = new Student("NCT", "VN", "KHMT", 2023, 35);
        System.out.println(((Student)person1).getProgram());
        ((Student)person1).setProgram("KHDL");
        System.out.println(((Student)person1).getProgram());
        System.out.println(((Student)person1).getYear());
        ((Student)person1).setYear(2000);
        System.out.println(((Student)person1).getYear());
        System.out.println(((Student)person1).getFee());
        ((Student)person1).setFee(10);
        System.out.println(((Student)person1).getFee());
        System.out.println((person1).toString());
    }
}
