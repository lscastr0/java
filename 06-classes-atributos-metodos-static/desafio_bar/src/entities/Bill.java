package entities;

public class Bill {
	public char gender;
	public int beer, barbecue, softDrink;

	public double cover() {
		return feeding() > 30 ? 0.00 : 4.00;
	}
	
	public double feeding() {
		return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
	}
	
	public double ticket() {
		if (gender == 'm' || gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
}
