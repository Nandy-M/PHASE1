package lockercompany;

import java.io.IOException;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) throws IOException {
		int menu_choise = 0, operations_choise = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\t*********************\n");
		System.out.println("\t Welcome to LockedMe.com");
		System.out.println("\t By Lockers Pvt Ltd. \n");
		System.out.println("\t**********************");
		System.out.println(" Developed by \t: Nandhini M \n Company\t: Simplilearn \n");
		while (true) {
			System.out.println("**********Prototype of the Application LockedMe.com**********  \n");
			System.out.println("---->choose one of the Menu options---->");
			System.out.println("1. Display Current Files");
			System.out.println("2. Business Level Operations");
			System.out.println("3. Close Application");
			try {
				menu_choise = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Exception raised:Null Exception occurred");
			}

			switch (menu_choise) {
			case 1:
				DisplayFiles.listFiles();
				break;
			case 2:
				Boolean temp = true;
				while (temp) {
					System.out.println("---->choose one of the BusinessLevel options---->");
					System.out.println("Option 1. Add a File");
					System.out.println("Option 2. Delete a File");
					System.out.println("Option 3. Search for a File");
					System.out.println("Option 4. Navigate to previous Menu options");
					System.out.println("Option 5. Terminate Program");

					try {
						operations_choise = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Exception raised:Null Exception occurred");
					}
					switch (operations_choise) {
					case 1:
						System.out.println("Put the name of a file to be created: ");
						String fileCreate = sc.next();

						// Calling the function to create the file
						BusinessOperations.createFile(fileCreate);
						break;

					case 2:
						// deletion of a file takes place
						System.out.print("Put the name of a file to be deleted: ");
						String fileDelete = sc.next();

						// Calling the function to delete the file
						BusinessOperations.deleteFile(fileDelete);
						break;
					case 3:
						// Search for a file takes place
						System.out.println("Put the name of a file to be searched: ");
						String fileSearch = sc.next();

						// Calling the function to search the file
						BusinessOperations.searchFile(fileSearch);
						break;
					case 4:
						temp = false;
						break;
					case 5:
						System.out.println("/tSuccessfully! Program Terminated ");
						System.exit(0);
					default:

						System.out.println("\n Opps! Invalid Input,Try again the process\n");
						break;
					}
				}

				break;
			case 3:

				// Voluntarily exiting the application
				sc.close();
				System.out.println("\n It was nice having you here! Happy to See you again. Good bye...");
				System.exit(1);
				break;

			default:
				// In the case of unprecedented input execute this
				System.out.println("\n\n Opps! Invalid Input, Select within the range of 1-3\n");
				break;

			}
		}

	}

}
