package SampleProblem_HashMapsAndHashFunctions.LongestConsecutiveSequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        // If the input array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Iterate over each element in the array
        for (int num : nums) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the current sequence
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the longest streak
                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}