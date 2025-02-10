package ProblemStatement;

import java.io.*;

public class LargeFileReadingEfficiency {

    public void usingFileReader(String filePath){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = bufferedReader.readLine()) == null){
               return;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void usingInputStreamReader(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            int i;
            while((i = bufferedReader.read()) == -1){
                 return;
            }

        }
        catch (IOException e){

        }
    }

    public static void main(String[] args) {
        LargeFileReadingEfficiency obj = new LargeFileReadingEfficiency();
        String filePath = "D:\\capgeminiTraining\\week-03-dataStructures\\Day06-RuntimeAnalysisAndBig-ONotation\\src\\ProblemStatement\\FileReadingDataSet.txt";
        long start, end;
        double result;
        start = System.nanoTime();
        obj.usingFileReader(filePath);
        end = System.nanoTime();
        result = (end - start)/1000000;
        System.out.println("Total time taken by reading file using filereader: "+result+" ms");
        start = System.nanoTime();
        obj.usingInputStreamReader(filePath);
        end = System.nanoTime();
        result = (end - start)/1000000;
        System.out.println("Total time taken by reading file using input stream reader: "+result+" ms");



    }
}
