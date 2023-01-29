package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1, "alex", 20.00);
		BusinessAccount bac = new BusinessAccount(2, "João", 30.00, 20.00);
		
		//UPCASTING
		Account acc1 = bac;
		Account acc2 = new SavingsAccount(3, "Maria", 50.00, 20.00);
		int n;
		//DOWNCASTING
		BusinessAccount acc3 = (BusinessAccount)acc1;

		//BusinessAccount acc4 = (BusinessAccount)acc2;
		//SavingsAccount acc5 = (SavingsAccount)acc;
		
		if(acc2 instanceof BusinessAccount) {
			BusinessAccount acc4 = (BusinessAccount) acc2;
		}
		
		if(acc2 instanceof SavingsAccount) {
			SavingsAccount acc4 = (SavingsAccount) acc2;
		}

	}

}
