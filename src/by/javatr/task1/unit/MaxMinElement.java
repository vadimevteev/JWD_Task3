package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.ArraySizeException;
import by.javatr.task1.exception.NullArrayException;

public class MaxMinElement {
    public static int findMinElement(Array array) throws NullArrayException, ArraySizeException {

        if(array == null || array.getArray().length == 0)
            throw new NullArrayException("Array is null or empty!");

        int arr[] = array.getArray();
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < min)
                min = arr[i];
        return min;
    }

    public static int findMaxElement(Array array) throws NullArrayException, ArraySizeException {

        if(array == null || array.getArray().length == 0)
            throw new NullArrayException("Array is null or empty!");

        int arr[] = array.getArray();
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }
}
