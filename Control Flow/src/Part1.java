import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese el total de sus ventas: ");
		float ventas = in.nextFloat();
		if (ventas >= 10000) {
			System.out.print("Su comisión es: " + (ventas * 0.3) + " (30%)");
		} else if (ventas >= 5000 && ventas <= 9999) {
			System.out.print("Su comisión es: " + (ventas * 0.2) + " (20%)");
		} else if (ventas >= 1000 && ventas <= 4999) {
			System.out.print("Su comisión es: " + (ventas * 0.1) + " (10%)");
		} else if (ventas < 1000) {
			System.out.print("N/A");
		}
		
		in.close();
	}

}
