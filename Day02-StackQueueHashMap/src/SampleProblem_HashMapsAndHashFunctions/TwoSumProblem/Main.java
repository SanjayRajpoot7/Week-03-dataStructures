package SampleProblem_HashMapsAndHashFunctions.TwoSumProblem;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {11,3,21,15};
        int target = 26;

        int[] result = twoSum.twoSum(nums, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
        } else {
            System.out.println("No solution found");
        }
    }
}
