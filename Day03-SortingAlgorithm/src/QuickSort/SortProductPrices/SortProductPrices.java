package QuickSort.SortProductPrices;

public class SortProductPrices {

        public static void quickSort(double[] prices, int low, int high) {
            if (low < high) {
                // Partition the array and get the pivot index
                int pivotIndex = partition(prices, low, high);

                // Recursively sort the left and right subarrays
                quickSort(prices, low, pivotIndex - 1); // Sort left subarray
                quickSort(prices, pivotIndex + 1, high); // Sort right subarray
            }
        }

        // Partition method
        private static int partition(double[] prices, int low, int high) {
            double pivot = prices[high]; // Choose the last element as the pivot
            int i = low - 1; // Index of the smaller element

            for (int j = low; j < high; j++) {
                // If the current element is smaller than or equal to the pivot
                if (prices[j] <= pivot) {
                    i++;
                    // Swap prices[i] and prices[j]
                    double temp = prices[i];
                    prices[i] = prices[j];
                    prices[j] = temp;
                }
            }

            // Swap the pivot element with the element at i+1
            double temp = prices[i + 1];
            prices[i + 1] = prices[high];
            prices[high] = temp;

            return i + 1; // Return the pivot index
        }

        // Helper method to print the array
        public static void printArray(double[] prices) {
            for (double price : prices) {
                System.out.print(price + " ");
            }
            System.out.println();
        }
}
