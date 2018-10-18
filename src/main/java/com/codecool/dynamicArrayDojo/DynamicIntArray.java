package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private static final int STARTING_ARRAY_SIZE = 0;
    private static final int STARTING_INDEX = 0;

    private Integer[] array;
    private int size;
    private int lastIndex;

    public DynamicIntArray() {
        this.size = STARTING_ARRAY_SIZE;
        this.array = new Integer[this.size];
    }

    public DynamicIntArray(int size) throws NegativeArraySizeException {
        if (size < 0) {
            throw new NegativeArraySizeException();
        } else {
            this.size = size;
            this.array = new Integer[this.size];
            this.lastIndex = size == 0 ? STARTING_INDEX - 1 : STARTING_INDEX;
        }
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