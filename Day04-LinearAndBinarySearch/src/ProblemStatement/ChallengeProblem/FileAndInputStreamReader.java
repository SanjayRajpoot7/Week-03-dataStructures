package ProblemStatement.ChallengeProblem;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileAndInputStreamReader {
    // Method to count words in a file using FileReader
        private static long countWordsUsingFileReader(String filePath) {
            long wordCount = 0;
            long startTime = System.currentTimeMillis();

            try (FileReader fileReader = new FileReader(filePath);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    wordCount += line.split("\\s+").length;  // Split on whitespace
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            long endTime = System.currentTimeMillis();
            System.out.println("FileReader Word Count: " + wordCount);
            System.out.println("Time Taken (FileReader): " + (endTime - startTime) + " ms");
            return wordCount;
        }

        // Method to count words in a file using InputStreamReader
        private static long countWordsUsingInputStreamReader(String filePath) {
            long wordCount = 0;
            long startTime = System.currentTimeMillis();

            try (FileInputStream fileInputStream = new FileInputStream(filePath);
                 InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    wordCount += line.split("\\s+").length;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            long endTime = System.currentTimeMillis();
            System.out.println("InputStreamReader Word Count: " + wordCount);
            System.out.println("Time Taken (InputStreamReader): " + (endTime - startTime) + " ms");
            return wordCount;
        }

        public static void main(String[] args) {
            String filePath = "D:\\capgeminiTraining\\week-03-dataStructures\\Day04-LinearAndBinarySearch\\src\\ProblemStatement\\FileReader\\Information.txt";  // Change to your file path

            System.out.println("Reading file using FileReader...");
            long wordsFileReader = countWordsUsingFileReader(filePath);

            System.out.println("\nReading file using InputStreamReader...");
            long wordsInputStreamReader = countWordsUsingInputStreamReader(filePath);

            // Final comparison
            System.out.println("\nComparison:");
            if (wordsFileReader == wordsInputStreamReader) {
                System.out.println("Both methods counted the same number of words.");
            } else {
                System.out.println("Word counts differ!");
            }
        }
    }

