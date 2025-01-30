package SampleProblem_HashMapsAndHashFunctions.LongestConsecutiveSequence;

public class Main {
    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Sequence Length: " +
                longestConsecutiveSequence.longestConsecutive(nums)); // Output: 4
    }
}
