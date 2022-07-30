package lockercompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class BusinessOperations {
	        //File creation function
			protected static void createFile (String fileToBeCreated) {
				File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeCreated );
				
				try {
					if (file.createNewFile() ) {
						System.out.println("File Created!");
					} else {
						System.out.println("File already exists :(");
					}
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			//File delete function
			protected static void deleteFile(String fileToBeDeleted) {
				
				File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeDeleted );
				
				if(file.exists()) {
					if ( file.delete() ) {
						System.out.println("Hurrah! File deleted successfully!");
					}
				} else {
					System.out.println("Sorry, File wasn't deleted --> File Not Found");
				}
			}
			//File search function
			protected static void searchFile(String fileToBeSearched) {
			        
				File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeSearched );
				
				if(file.exists()) {
					System.out.println("Yep! File found!");
				} else {
					System.out.println("Sorry, File is not here --> File Not Found");
				}	PrintWriter pw;  
		        try {  
		            pw = new PrintWriter(fileToBeSearched); //may throw exception   
		            pw.println("Filesaved");  
		        }  
		        catch (FileNotFoundException e) {  
		              
		            System.out.println(e);  
		        } 
			}


}
