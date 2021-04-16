package by.javatr.task2.unit;

import java.util.Comparator;

public class MinElementComparator  implements Comparator<int[] > {
    public int compare(int[] a, int[] b){
        int minElementsFirst = findMinElement(a);
        int minElementsSecond = findMinElement(b);

        int result = 0;
        if(minElementsFirst  > minElementsSecond)
            result = 1;
        else if(minElementsSecond > minElementsFirst )
            result =  -1;
        return result;
    }

    private int findMinElement(int[] array) {
        int max = array[0];
        for(int number : array)
            if(number < max)
                max = number;
        return max;
    }
}
