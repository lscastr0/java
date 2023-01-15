package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		System.out.println();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite os dados do %do contribuinte:\n", i + 1);
			register(list, sc);
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("Resumo do %do contribuinte:\n", i + 1);
			System.out.println(list.get(i));
			System.out.println();
		}

		sc.close();

	}

	public static void register(List<TaxPayer> list, Scanner sc) {

		System.out.printf("Renda anual com salário:  ");
		Double salaryIncome = sc.nextDouble();

		System.out.printf("Renda anual com prestação de serviço: ");
		Double serviceIncome = sc.nextDouble();

		System.out.printf("Renda anual com ganho de capital: ");
		Double capitalIncome = sc.nextDouble();

		System.out.printf("Gastos médicos: ");
		Double healthSpending = sc.nextDouble();

		System.out.printf("Gastos educacionais: ");
		Double educationIncome = sc.nextDouble();

		TaxPayer payer = new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpending, educationIncome);

		list.add(payer);

	}

}
