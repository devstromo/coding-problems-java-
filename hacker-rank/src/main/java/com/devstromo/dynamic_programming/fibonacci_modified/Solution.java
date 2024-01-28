package com.devstromo.dynamic_programming.fibonacci_modified;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (var inputStream = Solution.class.getClassLoader()
                .getResourceAsStream("dynamic_programming/fibonacci_modified/input/input00.txt")) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int t1 = Integer.parseInt(firstMultipleInput[0]);

            int t2 = Integer.parseInt(firstMultipleInput[1]);

            int n = Integer.parseInt(firstMultipleInput[2]);
            int result = Result.fibonacciModified(t1, t2, n);
            System.out.println(result);
        }
    }
}
