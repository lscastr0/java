package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle x = new Rectangle();

		System.out.println("Entre com a largura e altura do retângulo: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();

		System.out.printf("\nAREA = %.2f", x.area());
		System.out.printf("\nPERIMETRO = %.2f", x.perimeter());
		System.out.printf("\nDIAGONAL = %.2f", x.diagonal());

		sc.close();
	}
}
