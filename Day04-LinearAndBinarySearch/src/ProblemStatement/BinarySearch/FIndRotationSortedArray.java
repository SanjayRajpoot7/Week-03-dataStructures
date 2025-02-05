package ProblemStatement.BinarySearch;

public class FIndRotationSortedArray {
    public static void main(String[] args) {
        // Example rotated sorted array
        int[] arr = {5, 6, 7, 1, 2, 3, 4};

        // Find the rotation point
        int rotationPoint = findRotationPoint(arr);

        // Print the result
        System.out.println("The rotation point (smallest element) is at index: " + rotationPoint);
        System.out.println("The smallest element is: " + arr[rotationPoint]);
    }

    // Method to find the rotation point using Binary Search
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Perform Binary Search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is greater than the rightmost element
            if (arr[mid] > arr[right]) {
                // The smallest element is in the right half
                left = mid + 1;
            } else {
                // The smallest element is in the left half (including mid)
                right = mid;
            }
        }

        // When left == right, we have found the smallest element
        return left;
    }
}
