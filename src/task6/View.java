package task6;

import java.util.Arrays;

/**
 * Created by firsov on 22.03.2017.
 */
public class View {

    public void message(String str){
        System.out.println(str);
    }

    public void message(String message, int array[]){
        message(message + ": " + Arrays.toString(array));
    }

    public  void  message(String message, Integer arg){
        message(message + ": " + arg);
    }
}
