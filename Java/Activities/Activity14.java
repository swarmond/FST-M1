package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	    public static void main(String[] args) {
	        try {
	            // Step 1: Create a new File object
	            File myFile = new File("src/main/resources/newfile.txt");

	            // Step 2: Use createNewFile() to create the file
	            if (myFile.createNewFile()) {
	                System.out.println("File created: " + myFile.getName());
	                String content = "Hello, this is a test file using FileUtils!";
		            FileUtils.writeStringToFile(myFile, content, "UTF-8");
		            System.out.println("Successfully wrote to the file.");
	            } else {
	                System.out.println("File already exists.");
	            }
	            
	            // Read file
	            System.out.println("Data in file: " + FileUtils.readFileToString(myFile, "UTF8"));	            
	            
	         // Create directory
	            File destDir = new File("src/main/resources/destDir");
	            // Copy file to directory
	            FileUtils.copyFileToDirectory(myFile, destDir);
	 
	            // Get file from new directory
	            File newFile = FileUtils.getFile(destDir, "newfile.txt");
	            // Read data from file
	            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
	            // Print it
	            System.out.println("Data in new file: " + newFileData);
	            
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
}
