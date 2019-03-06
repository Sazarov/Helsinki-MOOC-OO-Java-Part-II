import java.util.*;

public class PersonalInformation {
	private Map<String, List<String>> phonebook = new HashMap<String, List<String>>();
	private Map<String, List<String>> addressbook = new HashMap<String, List<String>>();
	
	public void addNumber(String person, String number) {
		addToBook((HashMap) phonebook, person, number);
	}
	
	public void addAddress(String person, String address) {
		addToBook((HashMap) addressbook, person, address);
	}
	
	public String getNumber(String person) {
		if (hasPhoneNumber(person)) {
			return listToString(phonebook.get(person));
		}
		return "  not found";
	}
	
	public String listToString(List<String> list) {
		String str = "\n   ";
		for (String item :
				list) {
			str += item + "\n";
		}
		return str;
	}
	
	public String getAddress(String person) {
		if (hasAddress(person))
			return addressbook.get(person).get(0);
		return "address unknown";
	}
	
	private boolean hasPhoneNumber(String person) {
		return phonebook.containsKey(person);
	}
	
	private boolean hasAddress(String person) {
		return addressbook.containsKey(person);
	}
	
	public String searchByNumber(String number) {
		return findValueInBook((HashMap) phonebook, number);
	}
	
	private String findValueInBook(HashMap<String, List<String>> book, String searchValue) {
		String personOfInterest = "  not found";
		for (String person :
				book.keySet()) {
			if (book.get(person).contains(searchValue))
				personOfInterest = person;
		}
		return personOfInterest;
	}
	
	private void addToBook(HashMap<String, List<String>> book, String key, String value) {
		if (!book.containsKey(key)) {
			List<String> mapList = new ArrayList<String>();
			mapList.add(value);
			book.put(key, mapList);
			return;
		}
		
		book.get(key).add(value);
	}
	
	public void removePersonInformation(String person) {
		phonebook.remove(person);
		addressbook.remove(person);
	}
	
	public String getPersonInformation(String person) {
		boolean personIsInBooks = hasAddress(person) || hasPhoneNumber(person);
		String address = "  address: " + getAddress(person);
		String phoneNumbers = hasPhoneNumber(person) ? "  phone numbers: " + getNumber(person) : "  phone number not found";
		return personIsInBooks ? address + "\n" + phoneNumbers : "  not found";
	}
	
	private Set<String> getUniquePeopleFromLists(Map list1, Map list2) {
		Set<String> uniquePeople = new HashSet<String>();
		uniquePeople.addAll(list1.keySet());
		uniquePeople.addAll(list2.keySet());
		return uniquePeople;
	}
	
	public List<String> filteredList(String filter) {
		Set<String> uniquePeople = getUniquePeopleFromLists(phonebook, addressbook);
		List<String> fullPersonalInformation = new ArrayList<String>();
		for (String person :
				uniquePeople) {
			
			String personalInformation = "\n " + person + "\n" + getPersonInformation(person);
			
			if (personalInformation.contains(filter))
				fullPersonalInformation.add(personalInformation);
			
		}
		Collections.sort(fullPersonalInformation);
		return fullPersonalInformation;
		
	}
}
