package ProblemStatement.InputStreamReader;

import java.io.*;

public class ReadUserInputAndWriteFile {
    public static void main(String[] args) {
        String filePath = "D:\\capgeminiTraining\\week-03-dataStructures\\Day04-LinearAndBinarySearch\\src\\ProblemStatement\\InputStreamReader\\UserInputFile.txt";

        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw)){
            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            while (true) {
                // Read user input
                userInput = br.readLine();

                // Check if the user wants to exit
                if ("exit".equalsIgnoreCase(userInput)) {
                    System.out.println("Exiting...");
                    break;
                }

                // Write the input to the file
                bw.write(userInput);
                bw.newLine(); // Add a new line after each input
            }

            System.out.println("Input has been written to " + filePath);

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
