package day1;

public class Computer {
    public int year;
    public double price;
    public boolean isNotebook;
    public double hardDiskMemory;
    public double freeMemory;
    public String operationSystem;
    public String brand;

    public Computer (){

    }
    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    public void changeOperationSystem(String newOperationSystem) {
        this.operationSystem = newOperationSystem;
    }

    public void useMemory(double memory) {
        if (memory > this.freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            this.freeMemory -= memory;
        }
    }

    public String toString() {
        String result = "";
        result += "Year: " + this.year + "\n";
        result += "Price: " + this.price + "\n";
        result += "Is notebook: " + this.isNotebook + "\n";
        result += "Hard disk memory: " + this.hardDiskMemory + "\n";
        result += "Free memory: " + this.freeMemory + "\n";
        result += "Operation system: " + this.operationSystem + "\n";
        return result;
    }

    public void printComputer() {
        System.out.println(this.toString());
    }
}
