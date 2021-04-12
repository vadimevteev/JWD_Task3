package by.javatr.task2.unit;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;

public class SumElementsSorting {

    public static int[][] ascendingSortSumRowsElements(int[][] array) throws NullArrayException, ArraySizeException {
        int[] sums = findSumsRows(array);
        return Sorting.AscendingBubbleSort(array.clone(),sums);
    }

    public static int[][] descendingSortSumRowsElements(int[][] array) throws NullArrayException, ArraySizeException {
        int[] sums = findSumsRows(array);
        return Sorting.DescendingBubbleSort(array.clone(),sums);
    }


    public static int[] findSumsRows(int[][] array) throws NullArrayException, ArraySizeException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int[] arrSums = new int[array.length];
        for(int i = 0; i < array.length;i++){
            arrSums[i] = findSum(array[i]);
        }
        return arrSums;
    }

    public static int findSum(int[] array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int result = 0;
        for(int number : array){
            result += number;
        }
        return result;
    }
}
