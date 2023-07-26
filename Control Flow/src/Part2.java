import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese su edad: ");
		int edad = in.nextInt();
		float total;
		if (edad < 5) {
			total = (float) (7 * .60);
		} else if (edad > 60) {
			total = (float) (7 * .60);
		} else {
			System.out.print("Ingrese la cantidad de tickets que desea comprar: ");
			int nTickets = in.nextInt();
			total = 7 * nTickets;
			if (nTickets > 2) {
				total *= 0.30;
			}
		}
		System.out.print("Total a pagar: " + total + "€");
		in.close();
	}

}
