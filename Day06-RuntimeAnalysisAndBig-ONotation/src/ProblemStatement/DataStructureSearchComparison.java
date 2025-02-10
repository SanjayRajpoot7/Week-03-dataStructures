package ProblemStatement;


import java.util.*;

public class DataStructureSearchComparison {

    // Method to search in an Array (O(N))
    public static boolean searchInArray(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Method to search in a HashSet (O(1) average)
    public static boolean searchInHashSet(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Method to search in a TreeSet (O(log N))
    public static boolean searchInTreeSet(TreeSet<Integer> treeSet, int target) {
        return treeSet.contains(target);
    }

    public static void main(String[] args) {
        int N = 1_000_000;  // Dataset size
        int target = N - 1; // Target element to search (last element)

        // Initializing data structures
        int[] arr = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Populating data structures with numbers 0 to N-1
        for (int i = 0; i < N; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Measuring time for Array search (O(N))
        long startTime = System.nanoTime();
        boolean foundInArray = searchInArray(arr, target);
        long endTime = System.nanoTime();
        long arraySearchTime = (endTime - startTime) / 1_000_000; // Convert to ms

        // Measuring time for HashSet search (O(1))
        startTime = System.nanoTime();
        boolean foundInHashSet = searchInHashSet(hashSet, target);
        endTime = System.nanoTime();
        long hashSetSearchTime = (endTime - startTime) / 1_000_000; // Convert to ms

        // Measuring time for TreeSet search (O(log N))
        startTime = System.nanoTime();
        boolean foundInTreeSet = searchInTreeSet(treeSet, target);
        endTime = System.nanoTime();
        long treeSetSearchTime = (endTime - startTime) / 1_000_000; // Convert to ms

        // Printing results
        System.out.println("Target found in Array: " + foundInArray + ", Time: " + arraySearchTime + " ms");
        System.out.println("Target found in HashSet: " + foundInHashSet + ", Time: " + hashSetSearchTime + " ms");
        System.out.println("Target found in TreeSet: " + foundInTreeSet + ", Time: " + treeSetSearchTime + " ms");
    }
}
