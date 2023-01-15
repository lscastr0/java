package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion c1 = null, c2 = null;

		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.println("Digite os dados do primeiro campeão: ");
			} else {
				System.out.println("Digite os dados do segundo campeão: ");
			}

			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.println();

			System.out.print("Vida inicial: ");
			int life = sc.nextInt();
			System.out.println();

			System.out.print("Ataque: ");
			int attack = sc.nextInt();
			System.out.println();

			System.out.print("Armadura: ");
			int armor = sc.nextInt();
			System.out.println();
			sc.nextLine();

			if (i == 0) {
				c1 = new Champion(name, life, attack, armor);
			} else {
				c2 = new Champion(name, life, attack, armor);
			}
		}

		System.out.print("Quantos turnos você deseja executar? ");
		int turn = sc.nextInt();
		System.out.println();
		for (int i = 0; i < turn; i++) {
			c1.takeDamage(c2);
			c2.takeDamage(c1);

			System.out.printf("Resultado do turno %d:\n", i + 1);
			System.out.println(c1.status());
			System.out.println(c2.status());

			if (c1.getLife() == 0 || c2.getLife() == 0) {
				break;
			}
		}
		
		System.out.println("FIM DE COMBATE");

		sc.close();

	}

}
