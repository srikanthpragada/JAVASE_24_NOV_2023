package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		 
		Path p = Path.of("names.txt");
		
		if (Files.exists(p))
			System.out.println("Present");
		else
			System.out.println("Missing");
		
		System.out.println(Files.readString(p));
		 

	}

}
