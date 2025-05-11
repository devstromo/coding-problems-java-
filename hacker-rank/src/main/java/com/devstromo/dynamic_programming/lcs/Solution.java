package com.devstromo.dynamic_programming.lcs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static com.devstromo.helpers.TestsHelper.compareResults;
import static java.util.stream.Collectors.joining;

public class Solution {
    public static void main(String[] args) throws IOException {

        String inputFolder = "dynamic_programming/lcs/input/";
        String outputFolder = "dynamic_programming/lcs/output/";

        try {
            ClassLoader classLoader = Solution.class.getClassLoader();
            File inputDir = new File(classLoader.getResource(inputFolder).getFile());

            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.out.println("Input directory not found: " + inputDir.getAbsolutePath());
                return;
            }

            Path outputDirPath = Paths.get("hacker-rank/src/main/resources/dynamic_programming/lcs/output");
            if (!Files.exists(outputDirPath)) {
                Files.createDirectories(outputDirPath);
            }
            for (File inputFile : inputDir.listFiles()) {
                String fileName = inputFile.getName();

                String localOutputFilePath = outputDirPath + "/local_output_" + fileName;

                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(localOutputFilePath));
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                    int n = Integer.parseInt(firstMultipleInput[0]);
                    int m = Integer.parseInt(firstMultipleInput[1]);
                    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .toList();
                    List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .toList();
                    List<Integer> result = Result.longestCommonSubsequence(a, b);
                    bufferedWriter.write(result.stream()
                            .map(Object::toString)
                            .collect(joining(" ")) + "\n");
                    bufferedReader.close();
                    bufferedWriter.close();
                    String outputFilePath = outputFolder + fileName.replace("input", "output");
                    File expectedOutputFile = new File(classLoader.getResource(outputFilePath).getFile());

                    if (expectedOutputFile.exists()) {
                        compareResults(expectedOutputFile.getAbsolutePath(), localOutputFilePath);
                    } else {
                        System.out.println("Expected output file not found: " + expectedOutputFile.getAbsolutePath());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try (var inputStream = Solution.class.getClassLoader()
//                .getResourceAsStream("dynamic_programming/lcs/input/input00.txt")) {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//            int n = Integer.parseInt(firstMultipleInput[0]);
//            int m = Integer.parseInt(firstMultipleInput[1]);
//            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .toList();
//            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .toList();
//            List<Integer> result = Result.longestCommonSubsequence(a, b);
//        }
    }
}
