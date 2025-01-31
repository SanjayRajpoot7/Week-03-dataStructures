package HeapSort.SortJobApplication;

import java.util.Arrays;

public class Main {

    // Main method to test heap sort
    public static void main(String[] args) {
        SortJobApplication sortJobApplication = new SortJobApplication();
        int[] salaries = {50000, 75000, 30000, 120000, 95000, 40000};

        System.out.println("Before Sorting: " + Arrays.toString(salaries));

        sortJobApplication.heapSort(salaries);

        System.out.println("After Sorting (Ascending Order): " + Arrays.toString(salaries));
    }
}
