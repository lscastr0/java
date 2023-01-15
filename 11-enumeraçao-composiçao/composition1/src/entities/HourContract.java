package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hour;

	public HourContract() {

	}

	public HourContract(Date date, Double valuePerHour, Integer hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}

	public Date getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public Double totalValue() {
		return valuePerHour * hour;
	}

}
