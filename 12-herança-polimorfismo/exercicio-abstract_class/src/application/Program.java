package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Company;
import entitites.Individual;
import entitites.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data:%n", i+1);
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);

			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (op == 'i' || op == 'I') {
				System.out.print("health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (op == 'c' || op == 'C') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

		}
		
		for (TaxPayer c : list) {
			System.out.println(c.getName() + " $" + String.format("%.2f", c.tax()));
		}

		sc.close();

	}

}
