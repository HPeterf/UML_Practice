package uml;

public class Passenger extends Traveler {

	private int points;
	private int totalPoints;
	private Category category;
	private double money;
	private String name;

	public Passenger() {

	}

	public Passenger(int points, int totalPoints, Category category, double money, String name) {
		super();
		this.points = points;
		this.totalPoints = totalPoints;
		this.category = category;
		this.money = money;
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Passenger [points=" + points + ", totalPoints=" + totalPoints + ", category=" + category + ", money="
		        + money + ", name=" + name + "]";
	}

	@Override
	public int pay(int sum) {

		Airline airline = new Airline();
		Booking booking = new Booking();
		sum = airline.calcPrice(booking);
		booking.setPayed(true);

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
		if (passenger.getCategory().equals(category.ECONOMIC)) {
			pointAmount = (passenger.getPoints() + 10);
			passenger.setPoints(pointAmount);

		} else if (passenger.getCategory().equals(category.BUSINESS)) {
			pointAmount = (passenger.getPoints() + 15);
			passenger.setPoints(pointAmount);
		}

		return pointAmount;
	}

}
