package BubbleSort.SortStudentMarks;

public class Main {
    public static void main(String[] args) {
        int[] arr = {98,56,34,99,87,88};
        StudentMarksSorted studentMarksSorted = new StudentMarksSorted();
        studentMarksSorted.sortMarks(arr);
        for (int k: arr){
            System.out.print(k+" ");
        }

    }

}
