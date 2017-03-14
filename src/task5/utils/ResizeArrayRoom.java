package task5.utils;

import task5.entity.Room;

/**
 * Created by firsov on 14.03.2017.
 */
public class ResizeArrayRoom {

    private Room inputArray[] ;

    public ResizeArrayRoom(Room[] inputArray) {
        this.inputArray = inputArray;
    }

    public Room[] addValue( Room value){
        int size = inputArray.length + 1;
        Room result[] = new Room[size];
        System.arraycopy(inputArray, 0, result, 0, inputArray.length);
        result[size - 1] = value;
        return  result;
    }

    public Room[] addValue( Room[] atr){
        int size = inputArray.length + atr.length;
        if (0 != atr.length) {
            Room result[] = new Room[size];
            System.arraycopy(atr, 0 , result, 0, atr.length);
            System.arraycopy(inputArray, 0, result, atr.length, inputArray.length);
            return  result;
        }else {
            return inputArray;
        }
    }

}
