package task6;

import task6.utils.ArraysUtils;

/**
 * Created by firsov on 16.03.2017.
 */
public class HW2 {


    public static void main(String[] args) {
        View view = new View();
        int array[] = new int[]{-2,-3,-1,-13,-7,-6,-10};
        view.message("Set array", array);
        view.message("Sum element", + ArraysUtils.sum(array));
        view.message("Minimal element array", ArraysUtils.min(array));
        view.message("Max element array", ArraysUtils.max(array));
        view.message("Max positive", ArraysUtils.maxPositive(array)) ;
        view.message("Multiplication array", ArraysUtils.multiplication(array));
        view.message("Modulus", ArraysUtils.modulus(array));
        view.message("Second largest element array", ArraysUtils.secondLargest(array));
        view.message("Reverse array", ArraysUtils.reverse(array));
        view.message("Search for even elements", ArraysUtils.findEvenElements(array));
    }

}
