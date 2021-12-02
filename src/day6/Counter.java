package day6;

public class Counter {

    private static int personCount;

    public static void increaseCount(){
        personCount++;
    }

    public static void decreaseCount(){
        personCount--;
    }

    public static int getCount(){
        return personCount;
    }
}
