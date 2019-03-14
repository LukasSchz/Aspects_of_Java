package string.power;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class FormattetCon {

	public static void doWrite(int david, int dawson, int dillon) throws IOException{
		BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\Lukas\\my-eclipse-workspace\\ProjectsPluralsight\\src\\string\\power\\newFile.txt"));
		try(Formatter f = new Formatter(writer)){
			f.format("My nephews are %d, %d and %d years old.", david, dawson, dillon);
		} 
	}
}
