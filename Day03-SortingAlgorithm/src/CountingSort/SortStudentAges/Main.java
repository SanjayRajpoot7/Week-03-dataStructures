package CountingSort.SortStudentAges;

import java.util.Arrays;
public class Main {

    // Main method to test Counting Sort
    public static void main(String[] args) {
        SortStudentAges sortStudentAges = new SortStudentAges();
        int[] studentAges = {12, 15, 11, 18, 14};

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));

        sortStudentAges.countingSort(studentAges, 10, 18);

        System.out.println("After Sorting: " + Arrays.toString(studentAges));
    }
}
