package by.javatr.task1.runner;

import by.javatr.task1.creator.Creator;
import by.javatr.task1.entity.Array;
import by.javatr.task1.entity.Attribute;
import by.javatr.task1.exception.ArraySizeException;
import by.javatr.task1.exception.IncorrectFileException;
import by.javatr.task1.exception.NullArrayException;
import by.javatr.task1.unit.*;

import java.io.FileNotFoundException;
import java.util.Arrays;


public class Runner {


    public static void main(String... args) throws NullArrayException, ArraySizeException{

        final int SIZE = 5;
        int elementToFind = 15;

        try {
            System.out.println("Enter array from console: ");
            Array array = new Array(Creator.fillFromConsole(SIZE));
            ArraySort.BubbleSort(array);
            int element = BinarySearch.findElement(array, elementToFind);
            int maxElement = MaxMinElement.findMaxElement(array);
            int minElement = MaxMinElement.findMinElement(array);
            int[] primeNumbers = Numbers.findNumbers(array,Attribute.PRIME);
            int[] fibonacciNumbers = Numbers.findNumbers(array, Attribute.FIBONACCI);
            int[] threeDigitNumbers = Numbers.findNumbers(array,Attribute.THREE_DIGIT);

            System.out.println(Arrays.toString(array.getArray()));
            System.out.println(element);
            System.out.println(maxElement);
            System.out.println(minElement);
            System.out.println(Arrays.toString(primeNumbers));
            System.out.println(Arrays.toString(fibonacciNumbers));
            System.out.println(Arrays.toString(threeDigitNumbers));
        }
        catch (NullArrayException | ArraySizeException e){
            System.err.println(e);
        }
    }

}
