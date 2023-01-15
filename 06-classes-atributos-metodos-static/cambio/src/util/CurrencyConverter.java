package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double converter(double dolarValue, double dolatQauant) {
		return (1.0 + IOF) * (dolarValue * dolatQauant);
	}
}
