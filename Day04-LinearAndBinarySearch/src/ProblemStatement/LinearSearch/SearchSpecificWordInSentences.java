package ProblemStatement.LinearSearch;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchSpecificWordInSentences {
    public static void main(String[] args) {
        String sentences = "Hello i am jay from rajasthan. I have a great business" +
                " to earning money and feeding food for family.";
        String find = "Money";

//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader()))
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(sentences);

//        stringBuilder.toString().split("\\s");
        String[] words = sentences.toString().split("\\s");

        for(int i = 0; i < words.length; i++){
            if(words[i].equalsIgnoreCase(find)){
                System.out.println("The word is: "+find);
                System.out.println(sentences);
                return;
            }

        }
        System.out.println("Not found");

    }
}
