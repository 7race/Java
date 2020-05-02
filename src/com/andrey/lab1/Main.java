package com.andrey.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        swap(0, 4, arr);

    }

    public static boolean swap(int i, int j, int[] anArray) {
        if (i >= anArray.length || j >= anArray.length) {
            return false;
        }

        int r = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = r;

        for (int v : anArray)
            System.out.print(v + " ");

        return true;
    }

    static class MainTest {

        @Test
        @DisplayName("check swap method")
        void swap() {
            int[] array = {1, 2, 3, 4, 5, 6};
            boolean result = Main.swap(3, 4, array);
            assertTrue(result);
            assertEquals(array[3], 5);
            assertEquals(array[4], 4);
        }

        @Test
        @DisplayName("check swap method with incorrect index")
        void swapIndexOutOfBounds(){
            int[] array = {1, 2, 3, 4, 5, 6};
            boolean result = Main.swap(6, 7, array);
            assertFalse(result);
        }

        @Test
        @DisplayName("check swap method with the same index")
        void swapTheSameIndex(){
            int[] array = {1, 2, 3, 4, 5, 6};
            boolean result = Main.swap(3, 3, array);
            assertTrue(result);
        }

        @Test
        @DisplayName("check swap method with null")
        void swapNull(){
            assertThrows(NullPointerException.class, () -> Main.swap(0, 0, null));
        }
    }
}