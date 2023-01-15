package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Account p1;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println();
		System.out.print("Enter account name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println();
		System.out.print("Is there an inicial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y' || answer == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			p1 = new Account(accountNumber, name, value);
		} else {
			p1 = new Account(accountNumber, name);
		}
		
		
		System.out.println("Account data:");
		
		System.out.printf("Account %d, Holder: %s, Balance $ %.2f", p1.getAccountNumber(), p1.getName(), p1.getAccountValue());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		p1.deposit(deposit);
		
		System.out.println();
		System.out.printf("Account %d, Holder: %s, Balance $ %.2f", p1.getAccountNumber(), p1.getName(), p1.getAccountValue());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		p1.withdraw(withdraw);
		
		System.out.println();
		System.out.printf("Account %d, Holder: %s, Balance $ %.2f", p1.getAccountNumber(), p1.getName(), p1.getAccountValue());
		
		sc.close();

	}

}
