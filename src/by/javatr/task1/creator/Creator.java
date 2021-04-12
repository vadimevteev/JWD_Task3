package by.javatr.task1.creator;

import by.javatr.task1.exception.ArraySizeException;
import by.javatr.task1.exception.IncorrectFileException;
import by.javatr.task1.exception.IncorrectLimitsException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Creator {
    public static int[] fillFromConsole(int size) throws ArraySizeException {
        if(size < 0)
            throw new ArraySizeException("Incorrect array size");

        int[] array = new int[size];

        for (int i = 0; i < size;i++)
            array[i] = enterIntFromConsole();

        return array;
    }

    public static int[] fillRandom(int size,int from, int to) throws ArraySizeException, IncorrectLimitsException {
        if (size < 0)
            throw new ArraySizeException("Incorrect array size");

        if(from > to)
            throw new IncorrectLimitsException("Incorrect limits values");

        int[] array = new int[size];
        for (int i = 0;i < size;i++)
            array[i] = ((int)(Math.random() * (to - from)) + from);
        return array;
    }

    public static int[] fillFromFile(String filename) throws FileNotFoundException, IncorrectFileException {
        if(filename == null || filename.isEmpty())
            throw new IncorrectFileException("File is empty or null");

        Scanner input = new Scanner(new File(filename));
        StringBuilder startValues = new StringBuilder();
        int count = 0;
        while(input.hasNext()){
            startValues.append(input.next());
            count++;
        }


        String[] nextValues = startValues.toString().split(",");
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
            array[i] = Integer.parseInt(nextValues[i]);

        return array;
    }

    public static int enterIntFromConsole(){

        Scanner sc = new Scanner(System.in);

        int a = 0;

        while(!sc.hasNextInt()) {
            sc.next();
        }

        a=sc.nextInt();

        return a;
    }
}
