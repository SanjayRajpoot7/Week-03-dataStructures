package ProblemStatement.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {
    public void fileReader(){
        String filePath = "D:\\capgeminiTraining\\week-03-dataStructures\\Day04-LinearAndBinarySearch\\src\\ProblemStatement\\FileReader\\RandomData.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadFileUsingFileReader readFileUsingFileReader = new ReadFileUsingFileReader();
        readFileUsingFileReader.fileReader();
    }
}
