package uml;

import java.util.Arrays;

public class Airline {

	private String name;
	private Booking booking[];

	public Airline() {

	}

	public Airline(String name, Booking[] booking) {
		super();
		this.name = name;
		this.booking = booking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Booking[] getBooking() {
		return booking;
	}

	public void setBooking(Booking[] booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Airline [name=" + name + ", booking=" + Arrays.toString(booking) + "]";
	}

	public Booking createBooking(Passenger passenger, Flight flight[]) {
		Booking booking = new Booking();
		booking.getClazz();
		booking.getDate();
		booking.getFare();
		booking.setFlight(flight);
		booking.setPassenger(passenger);

		return booking;

	}

	public int calcPrice(Booking booking) {
		Passenger passenger = new Passenger();
		int fare = 0;
		if (passenger.getCategory().equals(Category.ECONOMIC)) {
			fare = booking.getFare();

		} else if (passenger.getCategory().equals(Category.BUSINESS)) {
			fare = booking.getFare() * 2;
		}
		return fare;
	}

	public void saveBooking(Booking booking) {
		saveBooking(createBooking((Passenger) booking.getPassenger(), booking.getFlight()));

	}

	public String queryFlights(Flight flight[]) {

		return Arrays.toString(flight);

	}
}
