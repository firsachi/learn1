package task3.module3_1;

/**
 * Created by firsov on 01.02.2017.
 */
public class View {

    private String mainString = "I am %s.";

    public void message(String value){
        System.out.println(String.format(mainString, value));
    }
}
