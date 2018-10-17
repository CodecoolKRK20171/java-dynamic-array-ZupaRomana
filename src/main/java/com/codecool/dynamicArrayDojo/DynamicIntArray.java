package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private static final int STANDARD_SIZE = 20;
    private int[] array;

    public DynamicIntArray() {
        this.array = new int[STANDARD_SIZE];
    }

    public DynamicIntArray(int size) {
        this.array = new int[size];
    }
}