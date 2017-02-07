package task3.module3_2;

/**
 * Created by firsov on 07.02.2017.
 */
public class Arithmetic {

    public Integer add(Integer a, Integer b){
        checkNull(a, "a");
        checkNull(a, "b");
        return a + b;
    }

    protected void checkNull(Integer val0 , String nameValue){
        if (null == val0){
            throw new IllegalArgumentException(String.format(Messages.ERROR_NULL, nameValue));
        }
    }
}
