package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vet = new int[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();

		}

		int cont = 0;
		System.out.println("NUMEROS PARES:");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont++;
			}

		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);

		sc.close();

	}

}
