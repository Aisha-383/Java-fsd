import java.io.*;

public class Write {

    public static void main(String[] args) {
    	 File file = new File( "C:/Users/SHAIK AFZAL/eclipse-workspace/FileHandling_pp/Text1.txt/"); 
    	 String textToWrite ="Writing from the Class Write";    
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(textToWrite);
            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
