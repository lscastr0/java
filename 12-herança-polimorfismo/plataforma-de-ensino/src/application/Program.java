package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da aula%n", i + 1);
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char op = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String title = sc.nextLine();

			if (op == 'c' || op == 'C') {
				System.out.print("URL do vídeo: ");
				String url = sc.next();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				list.add(new Video(title, url, seconds));
			} else if (op == 't' || op == 'T') {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				list.add(new Task(title, description, questionCount));
			}
		}

		int totalDuaration = 0;

		for (Lesson lesson : list) {
			totalDuaration += lesson.duration();
		}

		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuaration + " segundos");

		sc.close();

	}

}
