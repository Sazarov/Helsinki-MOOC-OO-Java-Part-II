import java.util.*;

public class UserInterface {
	private Scanner reader;
	private PersonalInformation personalInformation;
	
	public UserInterface(Scanner reader) {
		this.reader = reader;
		this.personalInformation = new PersonalInformation();
	}
	
	public void start() {
		System.out.println("phone search\n" +
				"available operations:\n" +
				" 1 add a number\n" +
				" 2 search for a number\n" +
				" 3 search for a person by phone number\n" +
				" 4 add an address\n" +
				" 5 search for personal information\n" +
				" 6 delete personal information\n" +
				" 7 filtered listing\n" +
				" x quit");
		while (true) {
			System.out.println("command: ");
			String command = reader.nextLine();
			
			if (command.equals("1")) {
				addNumber();
			} else if (command.equals("2")) {
				searchNumberByName();
			} else if (command.equals("3")) {
				searchNameByNumber();
			} else if (command.equals("4")) {
				addAddress();
			} else if (command.equals("5")) {
				getPersonalInformation();
			} else if (command.equals("6")) {
				deletePersonalInformation();
			} else if (command.equals("7")) {
				filteredSearch();
			} else if (command.equals("x")) {
				break;
			}
		}
	}
	
	private void filteredSearch() {
		System.out.println("keyword (if empty, all listed): ");
		String filter = reader.nextLine();
		
		List<String> fullPI = personalInformation.filteredList(filter);
		
		if(fullPI.isEmpty())
			System.out.println(" keyword not found");
		else {
			for (String str :
					fullPI) {
				System.out.println(str);
			}
		}
	}
	
	private void deletePersonalInformation() {
		System.out.println("whose information: ");
		String name = reader.nextLine();
		
		personalInformation.removePersonInformation(name);
	}
	
	private void getPersonalInformation() {
		System.out.println("whose information: ");
		String name = reader.nextLine();
		
		System.out.println(personalInformation.getPersonInformation(name));
	}
	
	private void addAddress() {
		System.out.println("whose address: ");
		String name = reader.nextLine();
		System.out.println("street: ");
		String address = reader.nextLine();
		System.out.println("city: ");
		address+= " " + reader.nextLine();
		
		personalInformation.addAddress(name, address);
	}
	
	
	private void searchNameByNumber() {
		System.out.println("number: ");
		String number = reader.nextLine();
		
		System.out.println(personalInformation.searchByNumber(number));
		
	}
	
	private void addNumber() {
		System.out.println("whose number: ");
		String name = reader.nextLine();
		System.out.println("number: ");
		String phoneNumber = reader.nextLine();
		
		personalInformation.addNumber(name, phoneNumber);
	}
	
	private void searchNumberByName() {
		System.out.println("whose number: ");
		String name = reader.nextLine();
		System.out.println(personalInformation.getNumber(name));
	}
}
