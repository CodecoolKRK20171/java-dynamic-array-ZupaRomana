package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private static final int STARTING_ARRAY_SIZE_WITHOUT_SIZE_GIVEN = 0;
    private static final int STARTING_INDEX = 0;
    private static final int STARTING_INDEX_WITH_ZERO_SIZE = -1;


    private Integer[] array;
    private int size;
    private int lastIndex;

    public DynamicIntArray() {
        this.size = STARTING_ARRAY_SIZE_WITHOUT_SIZE_GIVEN;
        this.array = new Integer[this.size];
        this.lastIndex = STARTING_INDEX_WITH_ZERO_SIZE;
    }

    public DynamicIntArray(int size) throws NegativeArraySizeException {
        if (size < 0) {
            throw new NegativeArraySizeException();
        } else {
            this.size = size;
            this.array = new Integer[this.size];
            this.lastIndex = size == 0 ? STARTING_INDEX_WITH_ZERO_SIZE : STARTING_INDEX;
        }
    }

    public void add(Integer element) throws IllegalArgumentException {

        if (element == null) {
            throw new IllegalArgumentException();
        }
        this.size++;
        Integer[] tempArray = new Integer[this.size];

        for (int i = 0; i <= this.lastIndex; i++) {
            tempArray[i] = this.array[i];
        }

        this.array = tempArray;
        this.array[++lastIndex] = element;
    }

    public void add(int[] elements) {
        for (int element : elements) {
            this.add(element);
        }
    }

    public void add(Integer[] elements) {
        for (Integer element : elements) {
            this.add(element);
        }
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException{
        if (index > this.lastIndex || index < STARTING_INDEX) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            this.size--;
            Integer[] tempArray = new Integer[this.size];

            for (int i = 0; i <= this.lastIndex; i++) {
                if (i < index) {
                    tempArray[i] = this.array[i];
                } else if (i > index) {
                    tempArray[i - 1] = this.array[i];
                }
            }

            this.lastIndex--;
            this.array = tempArray;
        }
    }

    public void insert(int index, int element) throws IllegalArgumentException {
        if (index < 0) {
            throw new IllegalArgumentException();
        } else {
            if (index <= this.lastIndex + 1) {
                this.size++;
            } else {
                this.size = index + 1;
            }
            Integer[] tempArray = new Integer[this.size];

            for (int i = 0; i <= this.lastIndex; i++) {
                if (i < index) {
                    tempArray[i] = this.array[i];
                } else if (i == index) {
                    tempArray[i] = element;
                    tempArray[i + 1] = this.array[i];
                } else {
                    tempArray[i + 1] = this.array[i];
                }
            }

            if (index > this.lastIndex) {
                tempArray[index] = element;
                this.lastIndex = index;
            } else {
                this.lastIndex++;
            }

            this.array = tempArray;

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