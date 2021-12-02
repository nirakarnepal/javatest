package day2;

public class Account {
    private int id;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account(int id, double balance, String name, String email, String phone) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public void transferBalance(Account account, double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            account.balance += amount;
        }
    }

    public void printAccount() {
        System.out.println("------------------------------------------------------");
        System.out.println("Account ID: " + this.id);
        System.out.println("Account Holder Name: " + this.name);
        System.out.println("Account Balance: " + this.balance);
        System.out.println("Account Holder Email: " + this.email);
        System.out.println("Account Holder Phone: " + this.phone);
        System.out.println("------------------------------------------------------");
    }
}
