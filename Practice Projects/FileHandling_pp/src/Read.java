import java.io.*;

public class Read{

    public static void main(String[] args) {
    	 File file = new File( "C:/Users/SHAIK AFZAL/eclipse-workspace/FileHandling_pp/Text1.txt/"); 

        // Reading from a file using FileReader
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("Contents of the file:" +"\n"+"Reading from class read" );
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}

