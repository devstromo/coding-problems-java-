package com.devstromo.regex.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;



public class Solution {
    public static void main(String[] args) throws IOException {
        try (var inputStream = Solution.class.getClassLoader()
          .getResourceAsStream("regex/ip/input.txt"); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            var regexIp = new MyRegex();
            while ((line = reader.readLine()) != null) {
                System.out.println(regexIp.isValidIP(line));
            }
        }
    }
}

class MyRegex {
    private static final String IPV4_PATTERN =
      "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
        + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern PATTERN = Pattern.compile(IPV4_PATTERN);

    public boolean isValidIP(String ip) {
        return PATTERN.matcher(ip)
          .matches();
    }
}
