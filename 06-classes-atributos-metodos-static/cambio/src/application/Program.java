package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor do dólar? ");
		double dolarValue = scanner.nextDouble();
		System.out.println();

		System.out.print("Quantos dólares serão comprados? ");
		double dolarQuant = scanner.nextDouble();
		System.out.println();

		System.out.printf("Valor a ser pago em reais = %.2f", CurrencyConverter.converter(dolarValue, dolarQuant));

		scanner.close();

	}

}
