package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] Args) {

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		Order order = new Order(1, new Date(), os2);
		Order order2 = new Order(1, new Date(), os1);
		
		System.out.println(order);
		System.out.println(order2);
	}
}
