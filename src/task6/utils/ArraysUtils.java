package task6.utils;

/**
 * Created by firsov on 16.03.2017.
 */
public final class ArraysUtils {
    
    public static final int sum(int array[]){
        int result = 0;
        for (int value : array){
            result += value;
        }
        return result;
    }

    public static final int min(int array[]){
        int min = Integer.MAX_VALUE;
        for (int value : array){
            if (min > value){
                min = value;
            }
        }
        return min;
    }

    public static final int max(int array[]){
        if( 1 == array.length ){
            return array[0];
        }
        int max = Integer.MIN_VALUE;
        for ( int value : array ){
            if(max < value){
                max = value;
            }
        }
        return max;
    }

    public static final Integer maxPositive(int array[]){
        int maxPositive = max(array);
        if (0 > maxPositive){
            System.out.print("Нет максимального положительного числа !!!!!");
            return null;
        } else {
            return maxPositive;
        }
    }

    public  static  final int[]  multiplication(int array[]){
        int sizeArray = array.length;
        int result[] = new int[sizeArray];
        for (int index = 0; index < sizeArray; index++){
            result[index] = array[index] * index;
        }
        return result;
    }

    public static  final int[] modulus(int array[]){
        int sizeArray = array.length;
        int result[] = new int[sizeArray];
        for (int index = 0; index < sizeArray; index++){
            result[index] = Math.abs(array[index]);
        }
        return result;
    }

    public  static  final int secondLargest(int array[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for ( int value : array){
            if (max < value){
                secondMax = max;
                max = value;
            }else  if (value > value) {
                secondMax = value;
            }
        }
        return secondMax;
    }

    public static final int[] reverse(int array[]){
        int size = array.length;
        //check size array
        if (2 > size){
            return array;
        }
        int result[] = new int[size];
        int length = size / 2;
        if (( size / 2 & 1) != 0){
            result[length] = array[length];
        }
        for (int index = 0; index < length; index++ ){
            int correctTmp = (index +1);
            result[size - correctTmp] = array[index];
            result[index] = array[size - correctTmp];
        }
        return result;
    }

    public static final int[] findEvenElements(int array[]){
        int index = 0;
        int result[] = new int[array.length];
        for (int value : array){
            if ((value & 1) == 0){
                result[index] = value;
                index++;
            }
        }
        return result;
    }
}
