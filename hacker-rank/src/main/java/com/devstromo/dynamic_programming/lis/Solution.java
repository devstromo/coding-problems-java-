package com.devstromo.dynamic_programming.lis;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (var inputStream = Solution.class.getClassLoader()
          .getResourceAsStream("dynamic_programming/lis/input/input20.txt")) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            //        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine()
              .trim());

            List<Integer> arr = IntStream.range(0, n)
              .mapToObj(i -> {
                  try {
                      return bufferedReader.readLine()
                        .replaceAll("\\s+$", "");
                  } catch (IOException ex) {
                      throw new RuntimeException(ex);
                  }
              })
              .map(String::trim)
              .map(Integer::parseInt)
              .collect(toList());

            int result = Result.longestIncreasingSubsequence(arr);
            System.out.println(result);
            //        bufferedWriter.write(String.valueOf(result));
            //        bufferedWriter.newLine();
            //
            //        bufferedReader.close();
            //        bufferedWriter.close();

        }

    }
}
