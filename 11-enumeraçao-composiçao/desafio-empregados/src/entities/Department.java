package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private Adress adress;
	private List<Employee> employees = new ArrayList<>();

	public Department() {

	}

	public Department(String name, int payDay, Adress adress) {
		this.name = name;
		this.payDay = payDay;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public int getPayDay() {
		return payDay;
	}

	public Adress getAdress() {
		return adress;
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payRoll() {
		double sum = 0.0;

		for (Employee c : employees) {
			sum += c.getSalary();
		}

		return sum;
	}

}
