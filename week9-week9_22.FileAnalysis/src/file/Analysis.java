package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
	private File file;
	
	public Analysis(File file) {
		this.file = file;
	}
	
	public int lines() throws Exception {
		Scanner reader = new Scanner(file);
		int numberOfLines = 0;
		while(reader.hasNext()) {
			numberOfLines++;
			reader.nextLine();
		}
		reader.close();
		return numberOfLines;
	}
	
	public int characters() throws Exception {
		Scanner reader = new Scanner(file);
		int numberOfCharacters = 0;
		while(reader.hasNext()) {
			numberOfCharacters += reader.nextLine().length()+1;
		}
		reader.close();
		return numberOfCharacters;
	}
}
