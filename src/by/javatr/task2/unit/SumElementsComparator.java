package by.javatr.task2.unit;

import by.javatr.task2.exception.ArraySizeException;
import by.javatr.task2.exception.NullArrayException;

import java.util.Comparator;

public class SumElementsComparator implements Comparator<int[] > {
    public int compare(int[] a,int[] b){
            int sumElementsFirst = findSum(a);
            int sumElementsSecond = findSum(b);

            int result = 0;
            if(sumElementsFirst > sumElementsSecond)
                result = 1;
            else if(sumElementsSecond > sumElementsFirst)
                result =  -1;
            return result;
    }

    private int findSum(int[] array) {

        int result = 0;
        for(int number : array){
            result += number;
        }
        return result;
    }
}
