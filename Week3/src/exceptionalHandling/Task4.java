package exceptionalHandling;

import java.io.File;
import java.util.Scanner;

//Read a list of numbers from a file and throw an exception if any of the numbers are positive

public class Task4 {

	public static void main(String[] args) {
		try {
			readNumbersFromFile("numbers.txt");
		} catch (Exception e) {
			System.out.println("Caught exception:"+e.getMessage());
		}

	}

	private static void readNumbersFromFile(String fileName) throws Exception {
		File file = new File(fileName);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(file);
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			if(num>0) {
				throw new Exception("Found a positive number: "+num);
			}
			System.out.println(num);
		}
		sc.close();
	}

}
