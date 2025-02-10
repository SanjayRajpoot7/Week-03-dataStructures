package ProblemStatement;
import java.util.Arrays;

public class SearchComparison {

    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static int[] generateDataset(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void comparePerformance(int size, int target) {
        int[] dataset = generateDataset(size);

        // Measure Linear Search Time
        long startTime = System.nanoTime();
        boolean foundLinear = linearSearch(dataset, target);
        long endTime = System.nanoTime();
        long linearTime = endTime - startTime;

        // Measure Binary Search Time
        startTime = System.nanoTime();
        boolean foundBinary = binarySearch(dataset, target);
        endTime = System.nanoTime();
        long binaryTime = endTime - startTime;

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search Time: " + linearTime / 1e6 + " ms | Found: " + foundLinear);
        System.out.println("Binary Search Time: " + binaryTime / 1e6 + " ms | Found: " + foundBinary);
    }

    public static void main(String[] args) {
        int target = 763;

        // Test different dataset sizes
        comparePerformance(1_000, target);
        comparePerformance(10_000, target);
        comparePerformance(1_000_000, target);
    }
}
