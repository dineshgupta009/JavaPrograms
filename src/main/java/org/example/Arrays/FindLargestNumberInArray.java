package org.example.Arrays;

import java.util.Arrays;
import java.util.List;

public class FindLargestNumberInArray {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 5, 2, 6, 4, 7, 8, 9, 3, 5, 9);
        int n = num.stream().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);
        System.out.println(n);
    }
}
