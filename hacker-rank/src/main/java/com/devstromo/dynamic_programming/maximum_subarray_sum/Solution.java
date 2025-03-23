package com.devstromo.dynamic_programming.maximum_subarray_sum;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.devstromo.helpers.TestsHelper.compareResults;
import static java.util.stream.Collectors.joining;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFolder = "dynamic_programming/maximum_subarray_sum/input/";
        String outputFolder = "dynamic_programming/maximum_subarray_sum/output/";

        try {
            ClassLoader classLoader = com.devstromo.dynamic_programming.abbreviation.Solution.class.getClassLoader();
            File inputDir = new File(classLoader.getResource(inputFolder).getFile());

            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.out.println("Input directory not found: " + inputDir.getAbsolutePath());
                return;
            }

            Path outputDirPath = Paths.get("hacker-rank/src/main/resources/dynamic_programming/maximum_subarray_sum/output");
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
                    IntStream.range(0, q).forEach(tItr -> {
                        try {

                            int n = Integer.parseInt(bufferedReader.readLine().trim());

                            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .toList();

                            List<Integer> result = Result.maxSubarray(arr);

                            bufferedWriter.write(
                                    result.stream()
                                            .map(Object::toString)
                                            .collect(joining(" "))
                                            + "\n"
                            );
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
}