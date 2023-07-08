package com.devstromo.strings.formatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (var inputStream = Solution.class.getClassLoader()
          .getResourceAsStream("strings/formatting/input.txt"); var reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String equalsSign = "=";
            String line;
            var builder = new StringBuilder(equalsSign.repeat(32)).append("\n");
            while ((line = reader.readLine()) != null) {
                var splitLine = line.split(" ");
                builder.append(String.format("%-15s%03d\n", splitLine[0], Integer.parseInt(splitLine[1])));
            }
            builder.append(equalsSign.repeat(32));
            System.out.println(builder);
        }
    }
}
