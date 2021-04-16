package by.javatr.task2.runner;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;
import by.javatr.task2.unit.MaxElementComparator;
import by.javatr.task2.unit.MinElementComparator;
import by.javatr.task2.unit.Sorting;
import by.javatr.task2.unit.SumElementsComparator;

import java.util.Arrays;

public class Runner {
    public static void main(String... args) throws NullArrayException, ArraySizeException {
        try {
            int[][] array = new int[][]{{22}, {5, 8, 9, 1}, {4, 8, -101}, {0}};

            MaxElementComparator comparatorMaxElement = new MaxElementComparator();
            MinElementComparator comparatorMinElement = new MinElementComparator();
            SumElementsComparator comparatorSumElement = new SumElementsComparator();

            int[][] sortedArr1 = Sorting.BubbleSort(array.clone(), comparatorMaxElement,false);
            int[][] sortedArr2 = Sorting.BubbleSort(array.clone(), comparatorMinElement,true);
            int[][] sortedArr3 = Sorting.BubbleSort(array.clone(), comparatorSumElement,false);
            System.out.println(Arrays.deepToString(sortedArr1));
            System.out.println(Arrays.deepToString(sortedArr2));
            System.out.println(Arrays.deepToString(sortedArr3));

        }
        catch (NullArrayException | ArraySizeException e){
            System.err.println(e);
        }
    }
}
