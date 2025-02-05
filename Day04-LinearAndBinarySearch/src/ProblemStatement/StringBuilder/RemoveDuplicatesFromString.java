package ProblemStatement.StringBuilder;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

    public String remove(String str){
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                stringBuilder.append(ch);
                set.add(ch);
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromString removeDuplicatesFromString = new RemoveDuplicatesFromString();
        String s = removeDuplicatesFromString.remove("Rajjj");
        System.out.println(s);
    }
}
