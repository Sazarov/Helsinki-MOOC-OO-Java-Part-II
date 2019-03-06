package wordinspection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
	private File file;
	
	public WordInspection(File file) {
		this.file = file;
	}
	
	public int wordCount() throws IOException {
		Scanner reader = new Scanner(file);
		int wordCount = 0;
		while (reader.hasNext()) {
			wordCount++;
			reader.nextLine();
		}
		return wordCount;
	}
	
	public List<String> searchFileForString(String match, char condition) throws IOException {
		Scanner reader = new Scanner(file);
		List<String> matchList = new ArrayList<String>();
		
		while (reader.hasNext()) {
			String currentLine = reader.nextLine();
			
			switch (condition) {
				case 'c': {
					if (currentLine.contains(match)) {
						matchList.add(currentLine);
					}
					break;
				}
				
				case 'e': {
					if (currentLine.endsWith(match)) {
						matchList.add(currentLine);
					}
					break;
				}
				case 'v': {
					if (currentLine.contains(match)) {
						matchList.add(currentLine);
					}
				}
				default:
					break;
			}
			
		}
		
		return matchList;
	}
	
	
	public List<String> wordsContainingZ() throws IOException {
		return searchFileForString("z", 'c');
	}
	
	public List<String> wordsEndingInL() throws IOException {
		return searchFileForString("l", 'e');
	}
	
	private String reverseString(String string) {
		String reversedString = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString += string.charAt(i);
		}
		return reversedString;
	}
	
	public List<String> palindromes() throws IOException {
		Scanner reader = new Scanner(file);
		List<String> matchList = new ArrayList<String>();
		
		while (reader.hasNext()) {
			String currentLine = reader.nextLine();
			if (reverseString(currentLine).equals(currentLine)) {
				matchList.add(currentLine);
			}
		}
		
		return matchList;
	}
	
	public List<String> wordsWhichContainAllVowels() throws IOException {
		String vowels = "aeiouyäö";
		String[] vows = new String[]{"a", "e", "i", "o", "u", "y", "ä", "ö"};
		Scanner reader = new Scanner(file);
		List<String> matchList = new ArrayList<String>();
		
		while (reader.hasNext()) {
			String currentLine = reader.nextLine();
			boolean containsAllVowels = true;
			for (int i = 0; i < vowels.length(); i++) {
				if(!currentLine.contains(vows[i])) {
					containsAllVowels = false;
				}
			}
			
			if(containsAllVowels) matchList.add(currentLine);
		}
		
		return matchList;
	}
}
