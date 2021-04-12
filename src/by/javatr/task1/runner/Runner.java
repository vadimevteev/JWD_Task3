package by.javatr.task1.runner;

import by.javatr.task1.creator.Creator;
import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.ArraySizeException;
import by.javatr.task1.exception.NullArrayException;
import by.javatr.task1.unit.*;

import java.util.Arrays;


public class Runner {


    public static void main(String... args) throws NullArrayException, ArraySizeException{
        final int size = 5;
        int elementToFind = 15;
        try {
            System.out.println("Enter array from console: ");
            Array array = new Array(Creator.fillFromConsole(size));
            int[] sortedArray = ArraySort.BubbleSort(array);
            int element = BinarySearch.findElement(array, elementToFind);
            int[] fibonacciNumbers = FibonacciNumbers.findFibonacci(array);
            int maxElement = MaxMinElement.findMaxElement(array);
            int minElement = MaxMinElement.findMinElement(array);
            int[] primeNumbers = PrimeNumbers.findPrimeNumbers(array);
            int[] threeDigitNumbers = ThreeDigitNumbers.findNumbersDifferentDigits(array);

            System.out.println(Arrays.toString(sortedArray));
            System.out.println(element);
            System.out.println(Arrays.toString(fibonacciNumbers));
            System.out.println(maxElement);
            System.out.println(minElement);
            System.out.println(Arrays.toString(primeNumbers));
            System.out.println(Arrays.toString(threeDigitNumbers));
        }
        catch (NullArrayException | ArraySizeException e){
            System.err.println(e);
        }
    }

}
