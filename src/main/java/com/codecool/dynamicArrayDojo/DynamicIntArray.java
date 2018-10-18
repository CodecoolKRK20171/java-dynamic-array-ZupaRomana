package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private static final int STARTING_ARRAY_SIZE = 0;

    private Integer[] array;

    public DynamicIntArray() {
        this.array = new Integer[STARTING_ARRAY_SIZE];
    }

    public DynamicIntArray(int size) throws NegativeArraySizeException {
        if (size < 0) {
            throw new NegativeArraySizeException();
        }

        this.array = new Integer[size];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (Integer element : array) {
            if (element != null)
            result.append(" ").append(element);
        }
        return result.toString();
    }
}