package filereadingwriting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteExample {

	
	static String content = "Hello "+
					 "we are learning "+
					 "Java";
	static String content1="Hello world";
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("D:\\test.txt");
		Files.write(path, content.getBytes(StandardCharsets.UTF_8));

	}

}
