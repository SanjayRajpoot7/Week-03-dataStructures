package ProblemStatement;

import java.util.Arrays;

public class SortingLargeDataEfficiently {
    // Sort element using bubble sort.
    public void bubbleSort(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len; i++){
            for(int j = 1; j <= len-i-1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Sort element using merge sort.
    public void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end - start) /2;

            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1,end);

            merge(arr, start, mid, end);
        }
    }

    public void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start, j = mid+1, k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i];
                i++;
            }
            else{
                temp[k++] = arr[j];
                j++;
            }
        }
        while(i <= mid){
            temp[k++] = arr[i];
            i++;
        }
        while(j <= end){
            temp[k++] = arr[j];
            j++;
        }

        for(i = 0; i < temp.length; i++){
            arr[start+i] = temp[i];
        }
    }


    // Sort element using quick sort.
    public void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivotIdx = partition(array, low, high);

            quickSort(array, low, pivotIdx-1);
            quickSort(array, pivotIdx+1, high);
        }
    }

    public int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low -1;

        for(int j = low; j < high; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;
    }
    public static void main(String[] args) {
        SortingLargeDataEfficiently sle = new SortingLargeDataEfficiently();
        int[] arr = new int[10000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        long sTime, eTime;
        double result;

          sTime = System.nanoTime();
          sle.mergeSort(arr, 0, arr.length - 1);
          eTime = System.nanoTime();
          result = eTime - sTime;
        System.out.println("Total time taken while sorting element using merge sort: "+(result/1000000)+" ms");

        sTime = System.nanoTime();
        sle.quickSort(arr, 0, arr.length - 1);
        eTime = System.nanoTime();
        result = eTime - sTime;
        System.out.println("Total time taken while sorting element using quick sort: "+(result/1000000)+" ms");

        sTime = System.nanoTime();
        sle.bubbleSort(arr);
        eTime = System.nanoTime();
        result = eTime - sTime;
        System.out.println("Total time taken while sorting element using bubble sort: "+(result/1000000)+" ms");
    }
}
