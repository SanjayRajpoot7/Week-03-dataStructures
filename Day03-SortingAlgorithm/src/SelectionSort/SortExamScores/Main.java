package SelectionSort.SortExamScores;

import java.util.Arrays;

public class Main {
    // Main method to test Selection Sort
    public static void main(String[] args) {
        SortExamScores sortExamScores = new SortExamScores();
        int[] examScores = {85, 70, 95, 60, 90, 75};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));

        sortExamScores.selectionSort(examScores);

        System.out.println("After Sorting (Ascending Order): " + Arrays.toString(examScores));
    }
}
