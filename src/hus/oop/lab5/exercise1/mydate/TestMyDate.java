package hus.oop.lab5.exercise1.mydate;

public class TestMyDate {
    public static void main(String[] args) {
//        MyDate date1 = new MyDate(2012 , 2 , 28) ;
//        System.out.println(date1);
//        System.out.println(date1.nextDay());
//        System.out.println(date1.nextDay());
//        System.out.println(date1.nextMonth());
//        System.out.println (date1.nextYear()) ; //
        MyDate date2 = new MyDate(2012 , 1 , 2) ;
        System.out.println(date2);
        System.out.println(date2.previousDay()) ; //
        System.out.println(date2.previousDay()) ;
        System.out.println(date2);
        System.out.println (date2.previousMonth()) ; //
        System.out.println(date2.previousYear());
        MyDate date3 = new MyDate(2012 , 2 , 29) ;
        System.out.println(date3.previousYear());
        MyDate date4 = new MyDate(2099, 11, 31);
        MyDate date5 = new MyDate(2011, 2, 29);
    }
}
