package by.javatr.task1.unit;

import by.javatr.task1.entity.Array;
import by.javatr.task1.exception.NullArrayException;

public class BinarySearch {
    public static int findElement(Array array, int element) throws NullArrayException {
        if(array == null)
            throw new NullArrayException("Array is null");

        int index = -1;
        if(array.getArray().length > 0) {
            int[] sortedArray = array.getArray();
            int low = 0;
            int high = sortedArray.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (sortedArray[mid] < element)
                    low = mid + 1;
                else if (sortedArray[mid] > element)
                    high = mid - 1;
                else if (sortedArray[mid] == element) {
                    index = mid;
                    break;
                }
            }
        }

        return index;
    }
}
