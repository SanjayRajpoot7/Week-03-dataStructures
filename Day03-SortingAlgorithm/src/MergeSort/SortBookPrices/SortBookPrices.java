package MergeSort.SortBookPrices;

public class SortBookPrices {

    // Main method to perform Merge Sort
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(prices, left, mid); // Sort left half
            mergeSort(prices, mid + 1, right); // Sort right half

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge method
    private static void merge(double[] prices, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid; // Size of right subarray

        // Temporary arrays to hold the two halves
        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        // Merge the two subarrays
        int i = 0, j = 0; // Initial indices of left and right subarrays
        int k = left; // Initial index of merged array

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Helper method to print the array
    public static void printArray(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
