	import java.io.*;
public class Append {

	public static void main(String[] args) {
	
		 File file = new File( "C:/Users/SHAIK AFZAL/eclipse-workspace/FileHandling_pp/Text1.txt/"); 
		 String textToAppend = "This text will be appended to the file.\n";

		        try (FileWriter writer = new FileWriter(file, true);
		             BufferedWriter bufferWriter = new BufferedWriter(writer);
		             PrintWriter out = new PrintWriter(bufferWriter)) {
		            out.println(textToAppend);
		            System.out.println("\n Text appended to the file successfully.");
		        } catch (IOException e) {
		            System.err.println("Error appending to the file: " + e.getMessage());
		        }
		    }
		}


