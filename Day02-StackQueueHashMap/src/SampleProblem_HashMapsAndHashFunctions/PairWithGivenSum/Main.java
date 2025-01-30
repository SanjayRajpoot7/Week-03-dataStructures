package SampleProblem_HashMapsAndHashFunctions.PairWithGivenSum;

public class Main {

    public static void main(String[] args) {
        FindPair findPair = new FindPair();
        int[] array = {1, 4, 45, 6, 10, 8};
        int targetSum = 16;

        if (findPair.hasPairWithSum(array, targetSum)) {
            System.out.println("Pair with the given sum exists.");
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}
