
import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int n;

		System.out.print("Enter any positive integer: ");
		n = console.nextInt();
		System.out.println("Fibonacci from 0 to " + n);
		System.out.println("n | Fibonacci");
		int i = 0;
		int n1 = 0, n2 = 1, suma = 0;
		do {
			System.out.println(i + " | " + suma);
			suma = n1 + n2;
			n1 = n2;
			n2 = suma;
			i++;
		} while (i < n); //do while
		console.close();
	}

}
