package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalay, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalay;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(Integer month, Integer year) {

		Calendar cal = Calendar.getInstance();
		Double sum = baseSalary;

		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int calMonth = 1 + cal.get(Calendar.MONTH);
			int calYear = cal.get(Calendar.YEAR);

			if (calMonth == month && calYear == year) {
				sum += c.totalValue();
			}
		}

		return sum;
	}

}
