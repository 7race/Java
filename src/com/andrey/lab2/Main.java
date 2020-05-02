package com.andrey.lab2;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(min(1,2,3));
    }

    static int min(int a, int b, int c) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(a);
        elements.add(b);
        elements.add(c);

        return Collections.min(elements);
    }
}
