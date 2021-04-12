package by.javatr.task2.runner;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;
import by.javatr.task2.unit.MaxElementsSorting;
import by.javatr.task2.unit.MinElementsSorting;
import by.javatr.task2.unit.SumElementsSorting;

import java.util.Arrays;

public class Runner {
    public static void main(String... args) throws NullArrayException, ArraySizeException {
        try {
            int[][] array = new int[][]{{22}, {5, 8, 9, 1}, {4, 8, -101}, {0}};

            int[][] sortedArr1 = MaxElementsSorting.ascendingSortMaxElement(array);
            int[][] sortedArr2 = MinElementsSorting.ascendingSortMinElement(array);
            int[][] sortedArr3 = SumElementsSorting.ascendingSortSumRowsElements(array);
            System.out.println(Arrays.deepToString(sortedArr1));
            System.out.println(Arrays.deepToString(sortedArr2));
            System.out.println(Arrays.deepToString(sortedArr3));

        }
        catch (NullArrayException | ArraySizeException e){
            System.err.println(e);
        }
    }
}
