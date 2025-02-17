package ioStreams;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		File fileObj = new File("src/ioStreams");
		if(fileObj.isDirectory() && fileObj.exists()) {
			String[] list = fileObj.list();
			for(String lst : list) {
				System.out.println(lst);
			}
		}
		

	}

}
