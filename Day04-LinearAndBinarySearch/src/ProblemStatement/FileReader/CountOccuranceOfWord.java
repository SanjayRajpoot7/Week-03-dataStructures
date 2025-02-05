package ProblemStatement.FileReader;
import java.io.*;

public class CountOccuranceOfWord {
    public static void main(String[] args) {
        String filePath = "D:\\capgeminiTraining\\week-03-dataStructures\\Day04-LinearAndBinarySearch\\src\\ProblemStatement\\FileReader\\Information.txt";

        // Word to count in the file
        String targetWord = "Good";

        // Initialize a counter for word occurrences
        int wordCount = 0;

        // Create FileReader and BufferedReader to read the file
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");

                // Check each word in the line
                for (String word : words) {
                    // Remove punctuation and convert to lowercase for accurate comparison
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    // Compare with the target word
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            // Print the final count of the target word
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
