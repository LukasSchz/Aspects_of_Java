package streamsFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamReadWrite {

	public static void main(String[] args) throws IOException {
		
		// Wenn die Initialisierung direkt im Try-Block stattfindet, dann wird die close-Methode direkt danach automatisch aufgerufen.
		// In dem Try-Block können auch mehrere Dinge initialisiert werden.
		try (FileInputStream input = new FileInputStream("C:\\Users\\Lukas\\my-eclipse-workspace\\ProjectsPluralsight\\src\\project\\test.txt");
				FileOutputStream output = new FileOutputStream("C:\\Users\\Lukas\\my-eclipse-workspace\\ProjectsPluralsight\\src\\project\\test2.txt")){
			int intVal = 0;
			while((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				System.out.println("Das Byte lautet: " + byteVal);
				output.write(byteVal);
			}
		} catch(FileNotFoundException e) {
			System.out.println("larifari");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Geht nicht");
			e.printStackTrace();
		} 
	}
}
