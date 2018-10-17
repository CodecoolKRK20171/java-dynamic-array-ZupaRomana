package com.codecool.dynamicArrayDojo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DynamicIntArrayMyTest {

    @Test
    void initialize_array_without_starting_size() {
        DynamicIntArray array = new DynamicIntArray();
    }

    @Test
    void initialize_array_with_starting_size() {
        DynamicIntArray array = new DynamicIntArray(30);
    }

    @Test
    void throws_exception_when_negative_size_passed() {
        assertThrows(NegativeArraySizeException.class, () -> {
           DynamicIntArray array = new DynamicIntArray(-1);
        });
    }
}