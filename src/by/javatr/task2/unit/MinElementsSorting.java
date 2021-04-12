package by.javatr.task2.unit;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;

public class MinElementsSorting {
    public static int[][] ascendingSortMinElement(int[][] array) throws NullArrayException, ArraySizeException {
        int[] sums = findArrMinElements(array);
        return Sorting.AscendingBubbleSort(array.clone(),sums);
    }

    public static int[][] descendingSortMaxElement(int[][] array) throws NullArrayException, ArraySizeException {
        int[] sums = findArrMinElements(array);
        return Sorting.DescendingBubbleSort(array.clone(),sums);
    }

    public static int[] findArrMinElements(int[][] array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int[] arrMax = new int[array.length];
        for(int i = 0; i < array.length;i++){
            arrMax[i] = findMinElement(array[i]);
        }
        return arrMax;
    }

    public static int findMinElement(int[] array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");
        if(array.length == 0)
            throw new NullArrayException("Array is empty!");

        int min = array[0];
        for(int number : array)
            if(number < min)
                min = number;
        return min;
    }
}
