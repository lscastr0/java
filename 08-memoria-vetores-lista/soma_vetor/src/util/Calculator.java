package util;

public class Calculator {

	public static double sum(double[] vet) {
		int sum = 0;
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i];
		}

		return sum;
	}

	public static double average(double[] vet) {
		return sum(vet) / vet.length;
	}
}
