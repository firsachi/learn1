package task3.module3_2;

/**
 * Created by firsov on 07.02.2017.
 */
public class Runner {

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.check(10, 3));
        System.out.println(adder.add(10, 3));
        System.out.println(adder.add(10, null));
    }
}
