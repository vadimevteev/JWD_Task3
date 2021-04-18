package by.javatr.task1.entity;

import by.javatr.task1.exception.ArraySizeException;


public class Array {

    private static final int START_SIZE = 0;
    private int[] array;
    public Array(){
        this.array = new int[START_SIZE];
    }

    public Array(int[] array) {

        this.array = array;
    }

    public Array(int size) throws ArraySizeException {

        if(size < 0)
            throw new ArraySizeException("Incorrect size of array!");

        this.array = new int[size];

    }

    public int getElement(int index) throws ArraySizeException {

        if(index < 0 || index > this.array.length - 1)
            throw new ArraySizeException("Index is out of the array`s size");

        return this.array[index];
    }

    public int getFirstIndex(int elementToFind){
        int index = -1;
        for(int i = 0; i < array.length;i++)
            if(array[i] == elementToFind){
                index = i;
                break;
            }
        return index;
    }

    public void setElement(int element,int index) throws ArraySizeException {

        if(index < 0 || index > this.array.length - 1)
            throw new ArraySizeException("Index is out of the array`s size");

        this.array[index] = element;
    }

    public int[] getArray() {
        return array;
    }



    @Override
    public String toString() {

        StringBuilder result = new StringBuilder(this.getClass().getName() + " {");

        if(array.length > 0) {
            for (int i = 0; i < this.array.length - 1; i++) {
                result.append(this.array[i]).append(", ");
            }
            result.append(this.array[array.length - 1]);
        }
        result.append("}");

        return result.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        if(this.array.length != array1.array.length) return false;

        for(int i = 0; i < this.array.length;i++){
            if(this.array[i] != array1.array[i])
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for(int i : this.array)
            result += i;

        return result;
    }
}
