package com.devstromo.dynamic_programming.abbreviation;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        String inputFolder = "dynamic_programming/abbreviation/input/";
        String outputFolder = "dynamic_programming/abbreviation/output/";

        try {
            ClassLoader classLoader = Solution.class.getClassLoader();
            File inputDir = new File(classLoader.getResource(inputFolder).getFile());

            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.out.println("Input directory not found: " + inputDir.getAbsolutePath());
                return;
            }

            Path outputDirPath = Paths.get("hacker-rank/src/main/resources/dynamic_programming/abbreviation/output");
            if (!Files.exists(outputDirPath)) {
                Files.createDirectories(outputDirPath);
            }

            for (File inputFile : inputDir.listFiles()) {
                String fileName = inputFile.getName();

                String localOutputFilePath = outputDirPath + "/local_output_" + fileName;

                try {
                    // Load the input file
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(localOutputFilePath));

                    // Read the number of queries
                    int q = Integer.parseInt(bufferedReader.readLine().trim());

                    // Process each query
                    IntStream.range(0, q).forEach(qItr -> {
                        try {
                            String a = bufferedReader.readLine();
                            String b = bufferedReader.readLine();

                            // Call the abbreviation function
                            String result = Result.abbreviation(a, b);

                            // Write the result to the local output file
                            bufferedWriter.write(result);
                            bufferedWriter.newLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });

                    bufferedReader.close();
                    bufferedWriter.close();

                    File expectedOutputFile = new File(classLoader.getResource(outputFolder + fileName.replace("input", "output")).getFile());

                    if (expectedOutputFile.exists()) {
                        compareResults(expectedOutputFile.getAbsolutePath(), localOutputFilePath);
                    } else {
                        System.out.println("Expected output file not found: " + expectedOutputFile.getAbsolutePath());
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void compareResults(String expectedFile, String actualFile) {
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
