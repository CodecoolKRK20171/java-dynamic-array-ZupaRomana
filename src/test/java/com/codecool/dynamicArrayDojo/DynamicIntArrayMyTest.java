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

    @Test
    void returns_string_when_toString_invoked() {
        DynamicIntArray array = this.initializeArray();

        String expected = "";
        String actual = array.toString();

        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    void returns_valid_string_when_no_size_passed_or_arguments_added() {
        DynamicIntArray array = this.initializeArray();

        String expected = "";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void returns_valid_string_when_only_size_passed() {
        DynamicIntArray array = this.initializeArray(50);

        String expected = "";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void adds_positive_element() {
        DynamicIntArray array = this.initializeArray();
        array.add(4);

        String expected = " 4";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void adds_negative_element() {
        DynamicIntArray array = this.initializeArray();
        array.add(-88);

        String expected = " -88";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void adds_wrapped_type() {
        DynamicIntArray array = this.initializeArray();
        Integer num = 5;
        array.add(num);

        String expected = " 5";
        String actual = array.toString();

        assertEquals(expected, actual);

    }

    @Test
    void adds_wrapped_type_object_created_with_new() {
        DynamicIntArray array = this.initializeArray();
        Integer num = new Integer(5);
        array.add(num);

        String expected = " 5";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void adds_array() {
        DynamicIntArray array = this.initializeArray();
        int[] arrayToAdd = new int[] {3, 6, -1, 7};
        array.add(arrayToAdd);

        String expected = " 3 6 -1 7";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void adds_empty_array() {
        DynamicIntArray array = this.initializeArray();
        int[] arrayToAdd = new int[0];
        array.add(arrayToAdd);

        String expected = "";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    @Test
    void adds_wrapped_type_array() {
        DynamicIntArray array = this.initializeArray();
        Integer[] arrayToAdd = new Integer[] {3, 8, 11};
        array.add(arrayToAdd);

        String expected = " 3 8 11";
        String actual = array.toString();

        assertEquals(expected, actual);
    }

    private DynamicIntArray initializeArray() {
        return new DynamicIntArray();
    }

    private DynamicIntArray initializeArray(int size) {
        return new DynamicIntArray(size);
    }
}