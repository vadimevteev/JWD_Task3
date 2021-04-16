package by.javatr.task2.unit;

import by.javatr.task2.exception.NullArrayException;

import java.util.Comparator;

public class MaxElementComparator implements Comparator<int[] > {

    public int compare(int[] a, int[] b){
        int maxElementsFirst = findMaxElement(a);
        int maxElementsSecond = findMaxElement(b);

        int result = 0;
        if(maxElementsFirst  > maxElementsSecond)
            result = 1;
        else if(maxElementsSecond > maxElementsFirst )
            result =  -1;
        return result;
    }

    private int findMaxElement(int[] array) {
        int max = array[0];
        for(int number : array)
            if(number > max)
                max = number;
        return max;
    }
}
