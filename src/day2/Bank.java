package day2;

public class Bank {

    public static void main(String[] args) {
        Account a1 = new Account(123,1000, "John","abc@gmail.com", "123456789");
        Account a2 = new Account(124, 20000,"Mary", "mary@gmail.com", "987654321");

        a1.setPhone("123456789");
        a1.deposit(100);
        a1.printAccount();
        a1.deposit(200);
        a1.withdraw(50);

        System.out.println("Before transfer");
        a1.printAccount();
        a2.printAccount();
        a1.transferBalance(a2, 100);

        a2.setPhone("987654321");
        a2.deposit(100);

        System.out.println("After transfer");
        a1.printAccount();
        a2.printAccount();



    }
}
