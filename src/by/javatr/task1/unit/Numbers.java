package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.entity.Attribute;
import by.javatr.task1.exception.NullArrayException;

public class Numbers {
    public static int[] findNumbers(Array array, Attribute attribute) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int startSize = 0;
        int[] arrNumbers = new int[startSize];
        for(int number : array.getArray())
            switch (attribute) {
                case FIBONACCI:
                    if (isFibonacci(number))
                        arrNumbers = addToMas(arrNumbers, number);
                    break;
                case PRIME:
                    if (isPrime(number))
                        arrNumbers = addToMas(arrNumbers, number);
                    break;
                case THREE_DIGIT:
                    if (isDifferentDigits(number))
                        arrNumbers = addToMas(arrNumbers, number);
                    break;
            }

        return arrNumbers;
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

    public static boolean isPrime(int num){

        if (num < 2)
            return false;

        boolean isPrime = true;
        for (int i=2; i<=num/2; i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int[] addToMas(int[] mas, int element){
        int[] newMas = new int[mas.length + 1];
        System.arraycopy(mas, 0, newMas, 0, mas.length);
        newMas[mas.length] = element;
        return newMas;
    }

}
