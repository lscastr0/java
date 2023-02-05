package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(new File("C:\\temp\\ina.txt"))) {

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
		}

	}

}
