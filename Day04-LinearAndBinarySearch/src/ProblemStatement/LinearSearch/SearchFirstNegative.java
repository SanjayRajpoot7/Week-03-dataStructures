package ProblemStatement.LinearSearch;

public class SearchFirstNegative {

    public static int findNegative(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++){
            if(array[i] < 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {77,4,7,0,-5,1,54,-8};
        System.out.println( findNegative(array));
    }
}
