package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		int[] vet2 = new int[n];
		int[] vet3 = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();

		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vet.length; i++) {
			vet2[i] = sc.nextInt();

		}

		for (int i = 0; i < vet.length; i++) {
			vet3[i] = vet[i] + vet2[i];

		}

		System.out.println("VETOR RESULTANTE: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet3[i]);

		}

		sc.close();

	}

}
