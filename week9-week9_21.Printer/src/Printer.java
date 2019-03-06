import java.io.File;
import java.util.Scanner;

public class Printer {
	private File file;
	
	
	public Printer(String fileName) {
		this.file = new File(fileName);
	}
	
	public void printLinesWhichContain(String word) throws Exception {
		Scanner reader = new Scanner(file);
		while (reader.hasNext()) {
			String line = reader.nextLine();
			if (word.isEmpty() || line.contains(word)) {
				System.out.println(line);
			}
		}
	}
	
}
