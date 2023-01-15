package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Emplyoee #%d:\n", i + 1);

			System.out.print("Id: ");
			int id = sc.nextInt();

			while(hasID(id, list)) {
				System.out.println("Id already exist. Enter a new ID: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee aux = new Employee(id, name, salary);

			list.add(aux);

		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();

			emp.increaseSalary(percentage);
		}

		for (Employee x : list) {
			System.out.printf("%d, %s, %.2f\n", x.getId(), x.getName(), x.getSalary());
		}

		sc.close();

	}

	public static boolean hasID(int id, List<Employee> list) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			return false;
		} else {
			return true;
		}

	}

}
