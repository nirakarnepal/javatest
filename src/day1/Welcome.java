package day1;

public class Welcome {

    //function to print current date and time
    public static void printDateTime() {
        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        printDateTime();
    }
}




