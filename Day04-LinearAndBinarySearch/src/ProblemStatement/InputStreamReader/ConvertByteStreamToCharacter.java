package ProblemStatement.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteStreamToCharacter {

    public static void main(String[] args) {
        String filePath = "D:\\capgeminiTraining\\week-03-dataStructures\\Day04-LinearAndBinarySearch\\src\\ProblemStatement\\InputStreamReader\\FileData.txt";
        try(
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("filePath"),"UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ){
            int i;
            while((i = bufferedReader.read()) != -1){
                System.out.println((char) i);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
