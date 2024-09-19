package com.devstromo.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestsHelper {

    private TestsHelper() {
        // Do nothing
    }

    public static void compareResults(String expectedFile, String actualFile) {
        try {
            List<String> expectedLines = Files.readAllLines(Paths.get(expectedFile));
            List<String> actualLines = Files.readAllLines(Paths.get(actualFile));

            boolean isEqual = expectedLines.equals(actualLines);
            if (isEqual) {
                System.out.println(actualFile + " matches the expected output.");
            } else {
                System.out.println(actualFile + " does not match the expected output.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
