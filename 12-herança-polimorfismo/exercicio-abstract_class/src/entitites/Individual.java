package entitites;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healDouble) {
		super(name, anualIncome);
		this.healthExpenditures = healDouble;
	}

	public Double getHealDouble() {
		return healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
		} else {
			return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
	}
}
