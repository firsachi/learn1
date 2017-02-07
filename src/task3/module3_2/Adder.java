package task3.module3_2;

/**
 * Created by firsov on 07.02.2017.
 */
public class Adder extends Arithmetic {

    public boolean check(Integer a, Integer b){
        checkNull(a, "a");
        checkNull(a, "b");
        if( a >= b){
            return true;
        }
        return false;
    }
}
