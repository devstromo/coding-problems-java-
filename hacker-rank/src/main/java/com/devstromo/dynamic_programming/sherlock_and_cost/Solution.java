package com.devstromo.dynamic_programming.sherlock_and_cost;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.devstromo.helpers.TestsHelper.compareResults;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFolder = "dynamic_programming/sherlock_and_cost/input/";
        String outputFolder = "dynamic_programming/sherlock_and_cost/output/";

        try {
            ClassLoader classLoader = Solution.class.getClassLoader();
            File inputDir = new File(classLoader.getResource(inputFolder).getFile());

            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.out.println("Input directory not found: " + inputDir.getAbsolutePath());
                return;
            }

            Path outputDirPath = Paths.get("hacker-rank/src/main/resources/dynamic_programming/sherlock_and_cost/output");
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
                    int t = Integer.parseInt(bufferedReader.readLine().trim());
                    IntStream.range(0, t).forEach(caseInput -> {
                        try {
                            String nLine = bufferedReader.readLine();
                            String bLine = bufferedReader.readLine();

                            if (nLine == null || bLine == null) {
                                System.out.println("Warning: Unexpected end of input file at case " + caseInput);
                                return;
                            }

                            int n = Integer.parseInt(nLine.trim());
                            List<Integer> inputList = Stream.of(bLine.trim().split(" "))
                                    .map(Integer::parseInt)
                                    .toList();

                            int result = Result.cost(inputList);

                            bufferedWriter.write(result + "\n");
                            File expectedOutputFile = new File(classLoader.getResource(outputFolder + fileName.replace("input", "output")).getFile());

                            if (expectedOutputFile.exists()) {
                                compareResults(expectedOutputFile.getAbsolutePath(), localOutputFilePath);
                            } else {
                                System.out.println("Expected output file not found: " + expectedOutputFile.getAbsolutePath());
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                    bufferedReader.close();
                    bufferedWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
