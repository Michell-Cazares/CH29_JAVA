import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name:  ");
		String name = console.next();
		System.out.println("Enter your lastname:  ");
		String lastname = console.next();
		printNameCharacters(name);
		printNameLength(name);
		printFullName(name, lastname);
		console.close();
	}

	private static void printNameLength(String name) {
		// TODO implement this code
		System.out.println("Name length: " + name.length());
	}

	private static void printNameCharacters(String name) {
		// TODO implement this code
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
		}
		System.out.println();
	}

	private static void printFullName(String name, String lastname) {
		// TODO implement this code
		System.out.println("Fullname: " + name + " " + lastname);
	}

}