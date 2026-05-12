package assignment11;

import java.io.*;
import java.util.Scanner;



public class FileReading {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        String longestWord = "";

        try {

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            
            while ((line = br.readLine()) != null) {

                lineCount++;

                
                charCount += line.length();

                
                String words[] = line.split(" ");

        
                wordCount += words.length;

                
                for (String word : words) {

                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            br.close();

            // Display output
            System.out.println("\nTotal Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Longest Word: " + longestWord);

        } catch (IOException e) {

            System.out.println("Error while reading file");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}