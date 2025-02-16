package exceptionalHandling;

import java.io.File;
import java.util.Scanner;

//Read a file and throw an exception if the file is empty

public class Task5 {

	public static void main(String[] args) {
		try {
			readFile("demo.txt");
		} catch (Exception e) {
			System.out.println("Caught exception: "+e.getMessage());
		}

	}

	@SuppressWarnings("resource")
	private static void readFile(String fileName) throws Exception {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		if(!sc.hasNextLine())
			throw new Exception("File is empty");
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		sc.close();
	}

}
