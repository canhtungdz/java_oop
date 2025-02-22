package hus.oop.lab6.exercise1.superclassperson;

public class TestStaff {
    public static void main(String[] args) {
        Person person2 = new Staff("CTstaff", "VINA", "VNU", 20);
        System.out.println(((Staff)person2).getSchool());
        ((Staff)person2).setSchool("BK");
        System.out.println(((Staff)person2).getSchool());
        System.out.println(((Staff)person2).getPay());
        ((Staff)person2).setPay(30);
        System.out.println(((Staff)person2).getPay());
        System.out.println(person2.toString());
    }
}
