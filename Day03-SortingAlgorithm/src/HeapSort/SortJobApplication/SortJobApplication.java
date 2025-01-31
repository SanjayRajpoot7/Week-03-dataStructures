package HeapSort.SortJobApplication;

public class SortJobApplication {

        // Function to perform heap sort
        public static void heapSort(int[] salaries) {
            int n = salaries.length;

            // Step 1: Build a Max Heap (rearrange the array)
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(salaries, n, i);
            }

            // Step 2: Extract elements from the heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Swap root (largest) with the last element
                swap(salaries, 0, i);

                // Heapify the reduced heap
                heapify(salaries, i, 0);
            }
        }

        // Heapify function to maintain max heap property
        private static void heapify(int[] arr, int n, int i) {
            int largest = i;   // Initialize largest as root
            int left = 2 * i + 1;   // Left child index
            int right = 2 * i + 2;  // Right child index

            // If left child is larger than root
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }

            // If right child is larger than the largest so far
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            // If largest is not root, swap and heapify
            if (largest != i) {
                swap(arr, i, largest);
                heapify(arr, n, largest);
            }
        }

        // Swap function
        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }


