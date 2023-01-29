package entities;

public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		balance = amount;
	}
	
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 5.0;
	}
	
}
