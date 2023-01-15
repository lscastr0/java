package entities;

public class TaxPayer {
	private Double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationIncome;

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationIncome) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationIncome = educationIncome;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public Double getEducationIncome() {
		return educationIncome;
	}

	public double salaryTax() {

		double monthSalary = salaryIncome / 12;

		if (monthSalary < 3000.00) {
			return 0.00;
		} else if (monthSalary < 5000.00) {
			return salaryIncome * 0.1;
		} else {
			return salaryIncome * 0.2;
		}

	}

	public double servicesTax() {
		return servicesIncome * 0.15;
	}

	public double capitalTax() {
		return capitalIncome * 0.2;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double aux = grossTax() * 0.3;

		if (aux < healthSpending + educationIncome) {
			return aux;
		} else {
			return healthSpending + educationIncome;
		}
	}

	public double netTax() {
		return grossTax() - taxRebate();

	}

	@Override
	public String toString() {
		return String.format("Imposto bruto total: %.2f\n", grossTax())
				+ String.format("Abatimento: %.2f\n", taxRebate()) + String.format("Imposto devido: %.2f", netTax());
	}

}
