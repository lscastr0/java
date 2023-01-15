package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		do {

			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();

		} while (n < 2 || n <= 0);

		double[] vet = new double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

		System.out.printf("\nSOMA = %.2f", Calculator.sum(vet));
		System.out.printf("\nMEDIA = %.2f", Calculator.average(vet));

		sc.close();

	}

}
