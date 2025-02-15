package hus.oop.lab4.exercise2.customerandaccount;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Alice", 'F');
        Account account1 = new Account(1001, customer1, 500.0);

        System.out.println(account1); // In thông tin tài khoản

        account1.deposit(150.0);
        System.out.println(account1); // Sau khi gửi tiền

        account1.withdraw(200.0);
        System.out.println(account1); // Sau khi rút tiền hợp lệ

        account1.withdraw(600.0); // Cố gắng rút nhiều hơn số dư
    }
}
