package lockercompany;

import java.io.File;
import java.util.ArrayList;

public class DisplayFiles {
	//Here Using bubble sort string array will be sorted
	protected static String[] Sorting(String array[], int size){
		String temp = "";
		for(int i=0; i<size; i++){
			for(int j=1; j<(size-i); j++){
				if(array[j-1].compareToIgnoreCase(array[j])>0){
					temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	//File listing function
	protected static void listFiles() {
		
		int CountFile = 0;
	    ArrayList<String> filenames = new ArrayList<String>();
		File CurrentdirectoryPath = new File(System.getProperty("user.dir"));
		File[] listOfFiles = CurrentdirectoryPath.listFiles();
		CountFile = listOfFiles.length;

		System.out.println("Displaying Files in ascending : ");
		for (int i = 0; i < CountFile; i++) {
		  if (listOfFiles[i].isFile()) {
		    filenames.add(listOfFiles[i].getName());
		  } 
		}
		
		String[] str = new String[filenames.size()];
		 
	    for (int i = 0; i < filenames.size(); i++) {
	        str[i] = filenames.get(i);
	    }
		
	    String[] sorted_filenames = Sorting(str, str.length);
		
		for(String currentFile: sorted_filenames) {
			System.out.println(currentFile);
		}

	}

}
