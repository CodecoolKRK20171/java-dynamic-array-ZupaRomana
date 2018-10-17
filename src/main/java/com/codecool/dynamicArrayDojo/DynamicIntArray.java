package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private static final int STANDARD_SIZE = 20;
    private int[] array;

    public DynamicIntArray() {
        this.array = new int[STANDARD_SIZE];
    }

    public DynamicIntArray(int size) throws NegativeArraySizeException {
        if (size < 0) {
            throw new NegativeArraySizeException();
        }
        this.array = new int[size];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int element : array) {
            result.append(" ").append(element);
        }
        return result.toString();
    }
}