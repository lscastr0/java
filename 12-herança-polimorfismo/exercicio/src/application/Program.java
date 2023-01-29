package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data:\n", i + 1);

			System.out.print("COmmon, used or import (c/u/i)? ");
			char op = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (op == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else if (op == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				list.add(new UsedProduct(name, price, sdf.parse(date)));
			} else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}

		sc.close();

	}

}
