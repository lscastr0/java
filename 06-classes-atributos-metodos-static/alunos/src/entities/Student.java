package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public void result() {
		if (finalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.printf("FAILED\nFALTARAM %.2f PONTOS", 60 - finalGrade());
		}
	}
}
