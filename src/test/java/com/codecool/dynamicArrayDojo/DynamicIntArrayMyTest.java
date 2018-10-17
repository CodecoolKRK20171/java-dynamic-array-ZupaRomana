package com.codecool.dynamicArrayDojo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DynamicIntArrayMyTest {

    @Test
    void initialize_array_without_starting_size() {
        this.initializeArray();
    }

    @Test
    void initialize_array_with_starting_size() {
        this.initializeArray(30);
    }

    @Test
    void throws_exception_when_negative_size_passed_to_constructor() {
        assertThrows(NegativeArraySizeException.class, () -> {
           this.initializeArray(-1);
        });
    }

    private DynamicIntArray initializeArray() {
        return new DynamicIntArray();
    }

    private DynamicIntArray initializeArray(int size) {
        return new DynamicIntArray(size);
    }
}