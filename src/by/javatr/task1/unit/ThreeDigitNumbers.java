package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.NullArrayException;

public class ThreeDigitNumbers {
    public static int[] findNumbersDifferentDigits(Array array) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int count = 0;
        for(int number : array.getArray()){
            if(isDifferentDigits(number))
                count++;
        }

        int i = 0;
        int[] arrNumbers = new int[count];
        for(int number : array.getArray()){
            if(isDifferentDigits(number)){
                arrNumbers[i] = number;
                 i++;
            }
        }
        return arrNumbers;
    }

    public static boolean isDifferentDigits(int num){
        boolean result = false;
        int number = Math.abs(num);
        if (number >= 100 && number < 1000){
            int digitFirst = number / 100;
            int digitSecond = number / 10 % 10;
            int digitThird = number % 100 % 10;

            if(digitFirst != digitSecond
                    && digitFirst != digitThird
                    && digitSecond != digitThird)
                result = true;
        }
        return result;
    }
}

