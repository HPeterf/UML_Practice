package uml;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Flight {

	private Date date;
	private Date departure;
	private Date arrival;
	private String[] classes;

	public Flight() {

	}

	public Flight(Date date, Date departure, Date arrival, String[] classes) {
		super();
		this.date = date;
		this.departure = departure;
		this.arrival = arrival;
		this.classes = classes;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Flight [date=" + date + ", departure=" + departure + ", arrival=" + arrival + ", classes="
		        + Arrays.toString(classes) + "]";
	}

	public static long getDifferenceInHours(Flight flight) {
		long diff = flight.getDeparture().getTime() - flight.getArrival().getTime();
		return TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
	}

}
