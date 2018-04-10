package uml;

import java.util.Arrays;
import java.util.Date;

public class Booking {

	private Traveler passenger;
	private Flight[] flight;
	private Date date;
	private boolean payed;
	private boolean checked;
	private int fare;
	private String clazz;

	public Booking() {
	}

	public Booking(Traveler passenger, Flight[] flight, Date date, boolean payed, boolean checked, int fare,
	        String clazz) {

		this.passenger = passenger;
		this.flight = flight;
		this.date = date;
		this.payed = payed;
		this.checked = checked;
		this.fare = fare;
		this.clazz = clazz;

	}

	public Traveler getPassenger() {
		return passenger;
	}

	public void setPassenger(Traveler passenger) {
		this.passenger = passenger;
	}

	public Flight[] getFlight() {
		return flight;
	}

	public void setFlight(Flight[] flight) {
		this.flight = flight;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Booking [passenger=" + passenger + ", flight=" + Arrays.toString(flight) + ", date=" + date + ", payed="
		        + payed + ", checked=" + checked + ", fare=" + fare + ", clazz=" + clazz + "]";
	}

}
