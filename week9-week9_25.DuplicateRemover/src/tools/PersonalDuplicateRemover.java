package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
	private Set<String> uniqueCharStrings = new HashSet<String>();
	private int duplicates;
	
	@Override
	public void add(String characterString) {
		if(!uniqueCharStrings.contains(characterString)) {
			uniqueCharStrings.add(characterString);
		} else {
			duplicates++;
		}
	}
	
	@Override
	public int getNumberOfDetectedDuplicates() {
		return duplicates;
	}
	
	@Override
	public Set<String> getUniqueCharacterStrings() {
		return uniqueCharStrings;
	}
	
	@Override
	public void empty() {
		uniqueCharStrings.clear();
		duplicates = 0;
	}
}
