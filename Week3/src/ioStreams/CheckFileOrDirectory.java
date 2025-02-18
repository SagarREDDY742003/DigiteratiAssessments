package ioStreams;

import java.io.File;

//Write a Java program to check if the given pathname is a directory or a file. 
public class CheckFileOrDirectory {

	public static void main(String[] args) {
		File fileObj = new File("src/ioStreams/ListOfFiles.java");
		if(fileObj.isFile())
			System.out.println("It is a File");
		if(fileObj.canWrite())
			System.out.println("It is a Directory");
	}

}
