package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Bill p1 = new Bill();

		p1.gender = scanner.next().charAt(0);
		p1.beer = scanner.nextInt();
		p1.softDrink = scanner.nextInt();
		p1.barbecue = scanner.nextInt();

		System.out.println(p1.total());

		scanner.close();

	}

}
