package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Digite o nome do aluno: ");
		student.name = scanner.nextLine();
		System.out.println();

		System.out.println("Digite as 3 notas do aluno:");
		student.grade1 = scanner.nextDouble();
		student.grade2 = scanner.nextDouble();
		student.grade3 = scanner.nextDouble();

		System.out.printf("Nota final = %.2f\n", student.finalGrade());
		student.result();
		
		scanner.close();
	}

}
