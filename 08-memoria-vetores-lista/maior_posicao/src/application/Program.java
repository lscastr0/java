package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		int bigger = 0, position = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();

		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > bigger) {
				bigger = vet[i];
				position = i;
			}
		}

		System.out.println("MAIOR VALOR = " + bigger);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		
		sc.close();

	}
	

}
