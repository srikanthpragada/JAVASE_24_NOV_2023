package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReplaceNewLine {

	public static void main(String[] args) throws IOException {
		 
		Path p = Path.of("names.txt");
		System.out.println(p.getClass());
		
		String contents = Files.readString(p);
		String newContents = contents.replace('.','\n');
		
		Files.writeString(p,  newContents);

	}

}
