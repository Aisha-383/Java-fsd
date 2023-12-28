import java.io.*;

public class TextFileModificationProgram {
    static void modifyFile(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);
        File modifiedFile = new File(fileToBeModified.getParent(), "tempFile.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified));
             FileWriter writer = new FileWriter(modifiedFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(oldString, newString);
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Replace the original file with the modified one
        if (fileToBeModified.delete()) {
            if (!modifiedFile.renameTo(fileToBeModified)) {
                System.out.println("Could not rename the file");
            }
        } else {
            System.out.println("Could not delete the original file");
        }
    }

    public static void main(String[] args) {
        modifyFile("c://temp//testFile2.txt", "85", "95");
        System.out.println("Done");
    }
}


