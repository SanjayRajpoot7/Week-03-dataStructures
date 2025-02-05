package ProblemStatement.ChallengeProblems;

public class BinarySearchTargetIndex {
    public static int findTarget(int[] array,int target){
        int n = array.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

       for(int i = 0; i < n; i++){
           if(array[i] == target){
               return i;
           }
       }


        return -1;
    }
    public static void main(String[] args) {
        int[] array = {8,0,-1,89};
        int target = 8;
        System.out.println(findTarget(array,target));
    }
}
