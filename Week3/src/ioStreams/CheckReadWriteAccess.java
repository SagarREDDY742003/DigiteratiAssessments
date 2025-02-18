package ioStreams;

import java.io.File;

//Write a Java program to check if a file or directory has read and write permissions. 
public class CheckReadWriteAccess {

	public static void main(String[] args) {
		File fileObj = new File("src/ioStreams/ListOfFiles.java");
		if(fileObj.canRead())
			System.out.println("File is Readable");
		if(fileObj.canWrite())
			System.out.println("File is Writable");
		else
			System.out.println("Not having read and write access");

	}

}
