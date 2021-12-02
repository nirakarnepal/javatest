package day6;

//utility class for counting
public class Counter {

    private static int personCount;

    private Counter() {
    }

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
