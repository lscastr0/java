package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus stauts;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.stauts = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStauts() {
		return stauts;
	}

	public Client getClient() {
		return client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {

		double sum = 0;

		for (OrderItem c : items) {
			sum += c.subTotal();
		}

		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(stauts + "\n");
		sb.append("Client: ");
		sb.append(client.getName());
		sb.append(" (" + sdf2.format(client.getDate()) + ") ");
		sb.append(client.getEmail());
		sb.append("\nOrder items:\n");
		
		for(OrderItem c : items) {
			sb.append(c.getProduct().getName() + ", " + c.getProduct().getPrice() + ", ");
			sb.append("Qauntity: " + c.getQuantity()+ ", ");
			sb.append("Subtotal: " + String.format("%.2f", c.subTotal()) + "\n");
		}
		
		sb.append("Total price: " + String.format("%.2f", total()));

		return sb.toString();

	}

}
