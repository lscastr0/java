import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double width, height, value, area, totalValue;

		System.out.print("Digite a largura do terreno: ");
		width = sc.nextDouble();
		System.out.println();

		System.out.print("Digite o comprimento do terreno: ");
		height = sc.nextDouble();
		System.out.println();

		System.out.print("Digite o valor do metro quadrado: ");
		value = sc.nextDouble();
		System.out.println();

		area = width * height;
		totalValue = area * value;

		System.out.printf("Area do terreno = %.2f", area);
		System.out.println();

		System.out.printf("Preco do terreno = %.2f", totalValue);
		System.out.println();

		sc.close();
	}
}
