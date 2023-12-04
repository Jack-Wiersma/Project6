public abstract class Beverage {
	private String bevName;
	private Type type;
	private Size size;
	private final double basePrice = 2;
	private final double sizePrice = 1;
	
	public Beverage(String bevName, Size size) {
		this.bevName = bevName;
		this.size = size;
	}
	
	public double getBasePrice() {
		return basePrice;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getBevName() {
		return bevName;
	}
	
	public Size getSize() {
		return size;
	}
	
	public String toString() {
		return(bevName + " " + size);
	}
	
	public boolean equals(Beverage anotherBev) {
		return(this.bevName.equals(anotherBev.bevName) && this.type == anotherBev.type && this.size == anotherBev.size);
	}
	
	public abstract double calcPrice();
}
