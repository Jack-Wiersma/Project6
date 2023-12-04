public class Alcohol extends Beverage{
	private boolean isWeekend;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, size);
		this.isWeekend = isWeekend;
	}
	
	public double calcPrice() {
		double price = 0;
		if (super.getSize().equals(Size.MEDIUM)) {
			price++;
		} else if (super.getSize().equals(Size.LARGE)) {
			price += 2;
		}
		if (isWeekend)
			return(super.getBasePrice() + price + 0.6);
		else
			return(super.getBasePrice() + price);
	}
	
	public Type getType() {
		return Type.ALCOHOL;
	}
	
	public String toString() {
		return (super.toString() + " " + isWeekend);
	}
	
	public boolean equals(Object anotherBev) {
		return (super.equals(anotherBev));
	}
}
