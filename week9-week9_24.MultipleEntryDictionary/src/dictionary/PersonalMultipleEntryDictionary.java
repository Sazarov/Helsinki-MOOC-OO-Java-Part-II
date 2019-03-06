package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
	private Map<String, Set<String>> dictionary = new HashMap<String, Set<String>>();
	
	@Override
	public void add(String word, String entry) {
		if (!dictionary.containsKey(word)) {
			Set<String> newSet = new HashSet<String>();
			newSet.add(entry);
			dictionary.put(word, newSet);
			return;
		}
		
		dictionary.get(word).add(entry);
	}
	
	@Override
	public Set<String> translate(String word) {
		if (dictionary.containsKey(word)) {
			return dictionary.get(word);
		}
		return null;
	}
	
	@Override
	public void remove(String word) {
		dictionary.remove(word);
	}
}
