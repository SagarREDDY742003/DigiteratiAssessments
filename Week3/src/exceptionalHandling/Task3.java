package exceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Method that reads a file and throws an exception if the file is not found

public class Task3 {
	
	public static void main(String[] args) {
		
		try {
			readFile("example.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
	}

}
