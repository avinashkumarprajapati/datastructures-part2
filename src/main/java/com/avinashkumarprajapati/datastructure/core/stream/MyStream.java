package com.avinashkumarprajapati.datastructure.core.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        filteredSum(integers);
    }

    public static void filteredSum(List<Integer> integers) {
        int sum =integers.stream()
                .filter(b -> b!=1)
                .mapToInt(b -> b)
                .sum();
        System.out.println(sum);
    }
}
