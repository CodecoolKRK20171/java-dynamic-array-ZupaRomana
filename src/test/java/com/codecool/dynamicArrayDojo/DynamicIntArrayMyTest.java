package com.codecool.dynamicArrayDojo;

import org.junit.jupiter.api.Test;

class DynamicIntArrayMyTest {

    @Test
    void initialize_array_without_starting_size() {
        DynamicIntArray array = new DynamicIntArray();
    }

    @Test
    void initialize_array_with_starting_size() {
        DynamicIntArray array = new DynamicIntArray(30);
    }
}
