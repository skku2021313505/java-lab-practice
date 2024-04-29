import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contact {
	
	HashMap<String, String> contactList;
	ArrayList<String> peopleNameList;
	ArrayList<String> functionNameList;
	
	public Contact() {
		this.contactList = new HashMap<>();
		this.peopleNameList = new ArrayList<>();
		this.functionNameList = new ArrayList<>();
		
		this.functionNameList.add("show");
		this.functionNameList.add("find");
		this.functionNameList.add("add");
		this.functionNameList.add("delete");
	}
	
	
	public void show() {
		for (int i = 0; i < this.peopleNameList.size(); i++) {
			String person = this.peopleNameList.get(i);
			String phoneNumber = this.contactList.get(person);
			System.out.println(person + " " + phoneNumber);
		}
	}
	
	public void find(String name) {
		if (!this.peopleNameList.contains(name)) {
			System.out.println("error");
			return;
		}
		String phoneNumber = this.contactList.get(name);
		System.out.println(phoneNumber);
	}
	
	public void add(String name, String phoneNumber) {
		if (this.peopleNameList.contains(name)) {
			System.out.println("error");
			return;
		}
		this.contactList.put(name, phoneNumber);
		this.peopleNameList.add(name);
		Collections.sort(this.peopleNameList);
	}
	
	public void delete(String name) {
		if (!this.peopleNameList.contains(name)) {
			System.out.println("error");
			return;
		}
		this.contactList.remove(name);
		this.peopleNameList.remove(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] arguments = new String[3];
			for (int i = 0; i < 3; i++) {
				arguments[i] = "";
			}
			for (int i = 0; i < input.split(" ").length; i++) {
				arguments[i] = input.split(" ")[i];
			}
			
			switch (arguments[0]) {
			case "show":
				contact.show();
				break;
			case "find":
				if (arguments[1] == "") {
					System.out.println("error");
				} else {
					contact.find(arguments[1]);
				}
				break;
			case "add":
				if (arguments[2] == "") {
					System.out.println("error");
				} else {
					contact.add(arguments[1], arguments[2]);
				}
				break;
			case "delete":
				if (arguments[1] == "") {
					System.out.println("error");
				} else {
					contact.delete(arguments[1]);
				}
				break;
			}
			
		}
		
	}
}
