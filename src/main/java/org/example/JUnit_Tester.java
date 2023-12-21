package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.Random;

public class JUnit_Tester {
    @Test
    public void testNormalSorting() {
        int[] array = {5, 2, 4, 6, 1, 3};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{}, array);
    }

    @ParameterizedTest
    @NullSource
    public void testWithNullArray(int[] inputArray) {
        assertThrows(NullPointerException.class, () -> Sortieralgorithmus.abc(inputArray));
    }

    @Test
    public void testSingleElement() {
        int[] array = {1};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array);
    }

    @Test
    public void testReverseSortedArray() {
        int[] array = {6, 5, 4, 3, 2, 1};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] array = {3, 2, 1, 3, 2, 1};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, array);
    }

    @Test
    public void testLargeArray() {
        int[] array = new int[1000]; // Großes Array mit Standardwerten (0)
        Sortieralgorithmus.abc_new(array);
        int[] expected = new int[1000]; // Erwartetes sortiertes Array
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithExtremeValues() {
        int[] array = {Integer.MAX_VALUE, 1, 0, -1, Integer.MIN_VALUE};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, -1, 0, 1,Integer.MAX_VALUE}, array);
    }

    @Test
    public void testArrayWithRepeatedValues() {
        int[] array = {5, 5, 5, 5};
        Sortieralgorithmus.abc_new(array);
        assertArrayEquals(new int[]{5, 5, 5, 5}, array);
    }

    @Test
    public void testWithRandomNumbers() {
        Random random = new Random();
        int[] array = new int[100];

        // Füllen des Arrays mit zufälligen Zahlen
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        // Kopieren des Arrays für den Vergleich
        int[] copyOfArray = Arrays.copyOf(array, array.length);

        // Sortieren mit abc_new und Arrays.sort
        Sortieralgorithmus.abc_new(array);
        Arrays.sort(copyOfArray);

        // Vergleich der sortierten Arrays
        assertArrayEquals(copyOfArray, array);
    }
    
    @Test
    public void testWithTest()
    {
        int test_halt_nh = 0;
        System.out.println(test_halt_nh);
    }

        // Optional: Test for inefficiency
        // This test would require measuring the time taken or counting the operations
        // in the abc_new method, which is beyond the scope of a simple JUnit test.
}
