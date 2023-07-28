import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String name;

		System.out.print("Your name: ");
		name = console.next();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		} // for

		console.close();
	}

}
