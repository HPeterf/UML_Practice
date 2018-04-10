package uml;

public enum Category {

	ECONOMIC("Economic"), BUSINESS("Business");

	private String category;

	private Category(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

}
