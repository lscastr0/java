package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Adress;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome da departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		Department department = new Department(departmentName, payDay, new Adress(email, phone));

		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados do funcionário #%d:\n", i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(name, salary);
			department.addEmployee(employee);

		}

		sc.close();
		
		showReport(department);

	}
	
	public static void showReport(Department department) {
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		
		System.out.printf("Departamento %s = R$ %.2f\n", department.getName(), department.payRoll());
		System.out.println("Pagamento realizado no dia " + department.getPayDay());
		System.out.println("Funcionários:");
		
		for (Employee c : department.getEmployee()) {
			System.out.println(c.getName());
		}
		
		System.out.println(
		"Para dúvidas favor entrar em contato: " 
		+ department.getAdress().getEmail() 
		+ " ou " 
		+ department.getAdress().getPhone());
	}

}
