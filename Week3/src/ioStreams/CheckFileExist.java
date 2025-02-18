package ioStreams;

import java.io.File;

//Write a Java program to check if a file or directory specified by pathname exists or not.
public class CheckFileExist {

	public static void main(String[] args) {
		File fileObj = new File("src/ioStreams/ListOfFiles.java");
		if(fileObj.exists())
			System.out.println("Exist");
		else
			System.out.println("NotExist");

	}

}
