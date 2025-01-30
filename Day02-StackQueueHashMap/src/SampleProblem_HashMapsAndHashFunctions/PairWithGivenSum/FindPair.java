package SampleProblem_HashMapsAndHashFunctions.PairWithGivenSum;
import java.util.HashMap;

public class FindPair {
    public static boolean hasPairWithSum(int[] array, int targetSum) {
        // Create a HashMap to store visited numbers
        HashMap<Integer, Boolean> visitedNumbers = new HashMap<>();

        // Iterate through the array
        for (int number : array) {
            // Calculate the complement (targetSum - current number)
            int complement = targetSum - number;

            // Check if the complement exists in the HashMap
            if (visitedNumbers.containsKey(complement)) {
                return true; // Pair found
            }

            // Add the current number to the HashMap
            visitedNumbers.put(number, true);
        }

        // No pair found
        return false;
    }

}