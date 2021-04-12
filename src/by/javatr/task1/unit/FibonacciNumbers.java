package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.NullArrayException;

public class FibonacciNumbers {
    public static int[] findFibonacci(Array array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int count = 0;
        int i = 0;
        for(int number : array.getArray())
            if(isFibonacci(number))
                count++;
        int[] arrFibonacci = new int[count];

        for(int number : array.getArray())
            if(isFibonacci(number)){
                arrFibonacci[i] = number;
                i++;
            }
        return arrFibonacci;
    }

    public static boolean isFibonacci(int number){
        boolean result = false;
        if(number > 0){
            int previous = 0, sum = 1, prePrevious;
            for (int i = 0; i < number; i++)
            {
                prePrevious = previous;
                previous = sum;
                sum = prePrevious + previous;
                if (sum == number)  {
                    result =  true;
                    break;
                }
            }
        }
        return result;
    }
}
