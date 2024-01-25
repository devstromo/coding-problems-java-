package com.devstromo.dynamic_programming.brick_games;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (var inputStream = com.devstromo.dynamic_programming.lis.Solution.class.getClassLoader()
                .getResourceAsStream("dynamic_programming/brick_games/input/input00.txt")) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            int t = Integer.parseInt(bufferedReader.readLine().trim());
            IntStream.range(0, t).forEach(tItr -> {
                try {
                    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

                    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .toList();
                    var array = new int[arrCount];
                    for (int i = 0; i < arrCount; i++) {
                        array[i] = arr.get(i);
                    }

                    long result = Result.bricksGame(array);
                    System.out.println(result);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
    }
}
