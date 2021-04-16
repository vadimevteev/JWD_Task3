package by.javatr.task2.unit;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;

import java.util.Comparator;

public class Sorting {
    public static int[][] BubbleSort(int[][] array, Comparator<int[]> comparator, boolean ascending) throws NullArrayException, ArraySizeException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int[][] arrNew;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if ((comparator.compare(array[i], array[i - 1]) < 0) == ascending) {
                    swapRow(array,i,i-1);
                    needIteration = true;
                }
            }
        }

        return array;
    }


    private static void swapRow(int[][] array, int row1, int row2) throws NullArrayException, ArraySizeException {
        if (array == null)
            throw new NullArrayException("Array is null");

        if (row1 < 0 || row1 > array.length - 1 || row2 < 0 || row2 > array.length - 1)
            throw new ArraySizeException("Index is out of the array`s size");

        if(array[row1] == null || array[row2] == null)
            throw new NullArrayException("Array is null");

        int[] tmp = array[row1];
        array[row1] = array[row2];
        array[row2] = tmp;
    }

}
