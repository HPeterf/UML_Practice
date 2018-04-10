package uml;

import java.util.Arrays;

public class Group extends Traveler {

	private Passenger[] passenger;

	public Group() {

	}

	public Group(Passenger[] passenger) {
		super();
		this.passenger = passenger;
	}

	public Passenger[] getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger[] passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Group [passenger=" + Arrays.toString(passenger) + "]";
	}

	@Override
	public int pay(int sum) {
		for (Passenger passenger : passenger) {
			Airline airline = new Airline();
			Booking booking = new Booking();
			sum = airline.calcPrice(booking);
			booking.setPayed(true);
		}
		return sum;
	}

	@Override
	public boolean checkIn() {
		Booking booking = new Booking();
		if (booking.isPayed()) {
			return true;
		}
		return false;
	}

	@Override
	public int addPoints() {
		int pointAmount = 0;
		Passenger passenger = new Passenger();
		if (passenger.getCategory().equals(Category.ECONOMIC)) {
			pointAmount = (passenger.getPoints() + 10);
			passenger.setPoints(pointAmount);

		} else if (passenger.getCategory().equals(Category.BUSINESS)) {
			pointAmount = (passenger.getPoints() + 15);
			passenger.setPoints(pointAmount);
		}

		return pointAmount;
	}
}
