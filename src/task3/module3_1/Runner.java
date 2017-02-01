package task3.module3_1;

/**
 * Created by firsov on 01.02.2017.
 */
public class Runner {

    public static void main(String[] args) {
        View view = new View();
        view.message("walking");
        view.message("flying");
        view.message(new Bird().sing());
        view.message("Bird");
    }
}
