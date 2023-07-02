package com.devstromo.regex.tags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

class Solution {

    public static void main(String[] args) throws IOException {
        try (var inputStream = Solution.class.getClassLoader()
          .getResourceAsStream("regex/tags/input.txt"); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            var n = Integer.parseInt(reader.readLine());
            while (n-- > 0) {
                var line = reader.readLine();
                var matchFound = false;
                var pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
                var matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                    matchFound = true;
                }
                if (!matchFound) {
                    System.out.println("None");
                }
            }
        }
    }
}
