package by.javatr.task2.unit;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;

public class Sorting {
    public static int[][] AscendingBubbleSort(int[][] array, int[] sortOrder) throws NullArrayException, ArraySizeException {
        if(array == null || sortOrder == null)
            throw new NullArrayException("Array is null");

        int[][] arrNew;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < sortOrder.length; i++) {
                if (sortOrder[i] < sortOrder[i - 1]) {
                    swap(sortOrder, i, i-1);
                    swapRow(array,i,i-1);
                    needIteration = true;
                }
            }
        }

        return array;
    }

    public static int[][] DescendingBubbleSort(int[][] array, int[] sortOrder) throws NullArrayException, ArraySizeException {
        if(array == null || sortOrder == null)
            throw new NullArrayException("Array is null");

        int[][] arrNew;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < sortOrder.length; i++) {
                if (sortOrder[i] > sortOrder[i - 1]) {
                    swap(sortOrder, i, i-1);
                    swapRow(array,i,i-1);
                    needIteration = true;
                }
            }
        }

        return array;
    }

    public static void swapRow(int[][] array, int row1, int row2) throws NullArrayException, ArraySizeException {
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


    public static void swap(int[] array, int ind1, int ind2) throws NullArrayException, ArraySizeException {
        if(array == null)
            throw new NullArrayException("Array is null");

        if(ind1 < 0 || ind1 > array.length - 1 || ind2 < 0 || ind2 > array.length -1)
            throw new ArraySizeException("Index is out of the array`s size");

        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
