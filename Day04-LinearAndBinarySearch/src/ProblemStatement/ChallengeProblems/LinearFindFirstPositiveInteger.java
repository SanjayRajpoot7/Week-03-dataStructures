package ProblemStatement.ChallengeProblems;

import java.util.ArrayList;
import java.util.List;

public class LinearFindFirstPositiveInteger {

    public int firstPositiveNumber(int[] array) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            array[i] = -1;
        }

        for(int num : array){
            if(num > 0){
                return num;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        LinearFindFirstPositiveInteger linearFindFirstPositiveInteger = new LinearFindFirstPositiveInteger();
        int[] array = {6,9,-2,-1};
        int i = linearFindFirstPositiveInteger.firstPositiveNumber(array);
        System.out.println("Value of firs integer: "+i);
    }
}
