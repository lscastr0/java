package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department name: ");
		String department = sc.nextLine();

		System.out.println("Enter work data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

		for (int i = 0; i < n; i++) {

			System.out.printf("Enter contract #%d data\n", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
			String date = sc.next();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hour = sc.nextInt();
			
			HourContract contract = new HourContract(sdf.parse(date), valuePerHour, hour);
			
			worker.addContract(contract);
		}
		
		System.out.println("Enter month and year to calculate income");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println(worker.income(month, year));
		
		
		sc.close();

	}

}
