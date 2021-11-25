package day2;

public class Bank {

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();


        a1.setName("John");
        a1.setId(1);
        a1.setPhone("123456789");
        a1.deposit(100);
        a1.printAccount();
        a1.deposit(200);
        a1.withdraw(50);
        a1.printAccount();


        a2.setName("Marry");
        a2.setId(2);
        a2.setPhone("987654321");

        a1.transferBalance(a1, a2, 110);
        a2.printAccount();



    }
}
