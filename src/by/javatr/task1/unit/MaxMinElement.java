package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.ArraySizeException;
import by.javatr.task1.exception.NullArrayException;

public class MaxMinElement {
    public static int findMinElement(Array array) throws NullArrayException, ArraySizeException {

        if(array.getArray().length == 0)
            throw new NullArrayException("Array is empty!");
        int[] arr = ArraySort.BubbleSort(array);
        return arr[0];
    }

    public static int findMaxElement(Array array) throws NullArrayException, ArraySizeException {

        if(array.getArray().length == 0)
            throw new NullArrayException("Array is empty!");
        int[] arr = ArraySort.BubbleSort(array);
        return arr[arr.length - 1];
    }
}
