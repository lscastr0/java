package application;

import java.util.Scanner;

import entities.Person;
import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Person[] list = new Person[n];

		for (int i = 0; i < list.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.println();

			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.println();

			System.out.print("Altura: ");
			double height = sc.nextDouble();
			System.out.println();

			list[i] = new Person(name, age, height);
		}

		double sum = 0;
		int number = 0;

		for (int i = 0; i < list.length; i++) {
			sum += list[i].getHeight();
			if (list[i].getAge() < 16) {
				number++;
			}
		}

		System.out.printf("Altura média: %.2f\n", Calculator.average(sum, list.length));
		System.out.printf("Pessoas com menos de 16 anos: %.2f\n", Calculator.percentage(number, list.length));

		for (int i = 0; i < list.length; i++) {
			if (list[i].getAge() < 16) {
				System.out.println(list[i].getName());
			}
		}
		sc.close();

	}

}
