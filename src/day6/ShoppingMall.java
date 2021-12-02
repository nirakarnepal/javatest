package day6;

public class ShoppingMall {

    public static void main(String[] args) {


        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());

        Counter.increaseCount();

        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());


        Counter.increaseCount();
        Counter.increaseCount();
        Counter.increaseCount();

        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());

        Counter.decreaseCount();
        Counter.decreaseCount();

        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
        System.out.println(Counter.getCount());
    }
}
