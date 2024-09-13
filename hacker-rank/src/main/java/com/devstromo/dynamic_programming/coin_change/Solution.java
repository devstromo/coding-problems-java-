package com.devstromo.dynamic_programming.coin_change;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        String inputFolder = "dynamic_programming/coin_change/input/";
        String outputFolder = "dynamic_programming/coin_change/output/";

        try {
            ClassLoader classLoader = com.devstromo.dynamic_programming.abbreviation.Solution.class.getClassLoader();
            File inputDir = new File(classLoader.getResource(inputFolder).getFile());

            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.out.println("Input directory not found: " + inputDir.getAbsolutePath());
                return;
            }

            Path outputDirPath = Paths.get("hacker-rank/src/main/resources/dynamic_programming/coin_change/output");
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

                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int n = Integer.parseInt(firstMultipleInput[0]);

                    int m = Integer.parseInt(firstMultipleInput[1]);

                    List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Long::parseLong)
                            .collect(toList());

                    // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
                    long ways = Result.getWays(n, c);

                    bufferedWriter.write(String.valueOf(ways));
                    bufferedWriter.newLine();

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
