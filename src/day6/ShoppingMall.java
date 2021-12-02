package day6;

public class ShoppingMall {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());

        counter1.increaseCount();

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());

        counter2.increaseCount();
        counter4.increaseCount();
        counter3.increaseCount();

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());

        counter1.decreaseCount();
        counter2.decreaseCount();

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());
    }
}
