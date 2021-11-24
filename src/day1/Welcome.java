package day1;

public class Welcome {

    //function to print current date and time
    public static void printDateTime() {
        java.util.Date date = new java.util.Date();
        System.out.println(date);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        printDateTime();

        Computer c1 = new Computer();
        Computer c2 = new Computer();

        c1.brand = "Apple";
        c1.year = 2018;
        c1.price = 1000;
        c1.operationSystem = "MacOS";
        c1.isNotebook = true;
        c1.changeOperationSystem("Windows 10");

        c2.brand = "Dell";
        c2.year = 2018;
        c2.price = 2000;
        c2.operationSystem = "Windows 10";
        c2.isNotebook = false;

        c1.printComputer();




    }
}




