package entities;

public class Product {

	private String name;
	private Double price;

	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ " + String.format("%.2f", price));

		return sb.toString();

	}
}
