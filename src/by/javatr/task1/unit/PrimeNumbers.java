package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.NullArrayException;

public class PrimeNumbers {

    public static int[] findPrimeNumbers(Array array) throws NullArrayException {

        if(array == null)
            throw new NullArrayException("Array is null");

        int count = 0;
        for (int num : array.getArray())
            if(isPrime(num))
                count++;

        int[] arrPrime = new int[count];
        int i = 0;
        for (int num : array.getArray())
            if(isPrime(num)){
                arrPrime[i] = num;
                i++;
            }
        return arrPrime;
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
}
