package by.javatr.task2.unit;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;

public class MaxElementsSorting {
    public static int[][] ascendingSortMaxElement(int[][] array) throws NullArrayException, ArraySizeException {
        int[] sums = findArrMaxElements(array);
        return Sorting.AscendingBubbleSort(array.clone(),sums);
    }

    public static int[][] descendingSortMaxElement(int[][] array) throws NullArrayException, ArraySizeException {
        int[] sums = findArrMaxElements(array);
        return Sorting.DescendingBubbleSort(array.clone(),sums);
    }

    public static int[] findArrMaxElements(int[][] array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int[] arrMax = new int[array.length];
        for(int i = 0; i < array.length;i++){
            arrMax[i] = findMaxElement(array[i]);
        }
        return arrMax;
    }

    public static int findMaxElement(int[] array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");
        if(array.length == 0)
            throw new NullArrayException("Array is empty!");

        int max = array[0];
        for(int number : array)
            if(number > max)
                max = number;
        return max;
    }
}
