package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.ArraySizeException;
import by.javatr.task1.exception.NullArrayException;

public class ArraySort {

    public static void swap(int[] array, int ind1, int ind2) throws NullArrayException, ArraySizeException {
        if(array == null)
            throw new NullArrayException("Array is null");

        if(ind1 < 0 || ind1 > array.length - 1 || ind2 < 0 || ind2 > array.length -1)
            throw new ArraySizeException("Index is out of the array`s size");

        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static int[] BubbleSort(Array array) throws NullArrayException, ArraySizeException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int[] arrNew = array.getArray();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arrNew.length; i++) {
                if (arrNew[i] < arrNew[i - 1]) {
                    swap(arrNew, i, i-1);
                    needIteration = true;
                }
            }
        }

        return arrNew;
    }

    public static int[] SelectionSort(Array array) throws NullArrayException, ArraySizeException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int[] arrNew = array.getArray();
        for (int left = 0; left < arrNew.length; left++) {
            int minInd = left;
            for (int i = left; i < arrNew.length; i++) {
                if (arrNew[i] < arrNew[minInd]) {
                    minInd = i;
                }
            }
            swap(arrNew, left, minInd);
        }

        return arrNew;
    }

    public static int[] InsertionSort(Array array) throws NullArrayException, ArraySizeException {
        if (array == null)
            throw new NullArrayException("Array is null");

        int[] arrNew = array.getArray();
        for (int left = 0; left < arrNew.length; left++) {
            int value = arrNew[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arrNew[i])
                    arrNew[i + 1] = arrNew[i];
                else break;
            }
            arrNew[i + 1] = value;
        }

        return arrNew;
    }
}
