package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.println();

		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println();

		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		System.out.println();

		System.out.printf("Funcionário: %s, R$ %.2f", employee.name, employee.netSalary());
		System.out.println();

		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		System.out.println();

		System.out.printf("Dados atualizados: %s, R$ %.2f", employee.name, employee.netSalary());

		sc.close();

	}

}
