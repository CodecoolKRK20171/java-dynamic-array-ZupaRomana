package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private static final int STARTING_ARRAY_SIZE = 0;
    private static final int STARTING_INDEXES_USED_WITH_ZERO_SIZE = 0;

    private int[] array;
    private int[] indexesUsed;

    public DynamicIntArray() {
        this.array = new int[STARTING_ARRAY_SIZE];
        this.indexesUsed = new int[STARTING_INDEXES_USED_WITH_ZERO_SIZE];
    }

    public DynamicIntArray(int size) throws NegativeArraySizeException {
        if (size < 0) {
            throw new NegativeArraySizeException();
        }

        this.array = new int[size];
        this.indexesUsed = new int[size];
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