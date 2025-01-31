package BubbleSort.SortStudentMarks;

public class StudentMarksSorted {
    public int[] sortMarks(int[] arr){
      int len = arr.length-1;
        boolean swapped;
        for(int i = 0; i < len; i++){
            swapped = false;
            for(int j = 0; j < len - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
            for( int k : arr){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        return arr;
    }
}
