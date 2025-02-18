package ioStreams;

import java.io.File;

//Write a Java program to get specific files with extensions from a specified folder. 
public class FilesOfSpecifiedExtension {

	public static void main(String[] args) {
		File fileObj = new File("src/ioStreams");
		String extension = ".java";
		File[] file = fileObj.listFiles((d,name)-> name.endsWith(extension));
		for(File fileName : file)
			System.out.println(fileName.getName());

	}

}
