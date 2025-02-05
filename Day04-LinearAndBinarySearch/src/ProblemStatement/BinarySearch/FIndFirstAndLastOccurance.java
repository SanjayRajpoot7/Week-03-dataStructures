package ProblemStatement.BinarySearch;

import java.util.*;
public class FIndFirstAndLastOccurance {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                firstIndex = mid;  // Update first occurrence
                right = mid - 1;   // Search in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstIndex;
    }

    // Function to find the last occurrence using binary search
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                lastIndex = mid;   // Update last occurrence
                left = mid + 1;    // Search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastIndex;
    }

    // Function to return the first and last occurrence of the target
    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 5, 6, 8, 9}; // Sorted array
        int target = 4;

        int[] result = findFirstAndLastOccurrence(arr, target);
        System.out.println("First and Last Occurrence of " + target + ": " + Arrays.toString(result));

    }
}
