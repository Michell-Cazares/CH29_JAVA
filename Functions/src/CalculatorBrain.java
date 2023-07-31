import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		float a ,b;
		String r = "";
		do {
			System.out.println("Enter number a:  ");
			a = console.nextFloat();
			System.out.println("Enter number b:  ");
			b = console.nextFloat();
			System.out.println();
			System.out.println("Enter operation required: ");
			System.out.println("Addition |1|");
			System.out.println("Substraction |2|");
			System.out.println("Multiplication |3|");
			System.out.println("Division |4|");
			System.out.println("Square Root |5|");
			System.out.println("Power Of |6|");
			r = console.next();
			switch (r) {
			case "1":
				System.out.println("Addition: " + addition(a, b));
				break;
			case "2":
				System.out.println("Substraction: " + substraction(a, b));
				break;
			case "3":
				System.out.println("Multiplication: " + multiplication(a, b));
				break;
			case "4":
				System.out.println("Division: " + division(a, b));
				break;
			case "5":
				System.out.println("Square Root of b: " + squareRoot(b));
				break;
			case "6":
				System.out.println("Power of a: " + powerOf(a, b));
				break;
			}
			System.out.println("Again? (y/n): ");
			r = console.next();
		} while (r == "y");
		
		console.close();
	}

	private static float addition(float a, float b) {
		// TODO implement this code
		return a + b;
	}

	private static float substraction(float a, float b) {
		// TODO implement this code
		return a - b;
	}

	private static float multiplication(float a, float b) {
		// TODO implement this code
		return a * b;
	}

	private static float division(float a, float b) {
		// TODO implement this code
		return a / b;
	}

	private static float squareRoot(float n) {
		// TODO implement this code
		return n * n;
	}

	private static float powerOf(float a, float b) {
		// TODO implement this code
		return (float) Math.pow(a, b);
	}

}
