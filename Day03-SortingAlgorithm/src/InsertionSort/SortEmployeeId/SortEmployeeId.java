package InsertionSort.SortEmployeeId;

public class SortEmployeeId {
     public void sortEmployeeId(int[] employeeId){
        int n = employeeId.length;

        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && employeeId[j-1] > employeeId[j]){
                int temp = employeeId[j];
                employeeId[j] = employeeId[j-1];
                employeeId[j-1] = temp;
                j--;
            }

             System.out.print("In every step: ");
             for(int store : employeeId){
                 System.out.print(store+" ");
             }
             System.out.println();

         }
         System.out.println("Final sorted employee id: ");
         for(int j : employeeId){
             System.out.print(j+" ");
         }
     }
}
//
//int n = employeeId.length-1;
//         for(int i = 1; i <= n; i++){
//int hold = employeeId[i];
//int j = i-1;
//
//               while(j>=0 && employeeId[j] > hold){
//employeeId[j+1] = employeeId[j];
//j--;
//        }
//employeeId[j+1] = hold;


//
//int n = employeeId.length;
//
//// Outer loop: Iterate through each element
//         for (int i = 1; i < n; i++) {
//int j = i;
//
//// Inner loop: Swap adjacent elements if they are out of order
//             while (j > 0 && employeeId[j-1] > employeeId[j]) {
//// Swap arr[j] and arr[j - 1]
//int temp = employeeId[j];
//employeeId[j] = employeeId[j - 1];
//employeeId[j - 1] = temp;
//
//j--; // Move to the previous element
//        }
