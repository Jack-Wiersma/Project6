public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean addProtein;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
		
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	public String toString() {
		return (super.getBevName() + super.getSize() + addProtein + numOfFruits + calcPrice());
	}
	
	public double calcPrice() {
		double price = 0;
		if (addProtein)
			price += 1.5;
		price += (numOfFruits * 0.5);
		if (super.getSize().equals(Size.MEDIUM)) {
			price++;
		} else if (super.getSize().equals(Size.LARGE)) {
			price += 2;
		}
		return (super.getBasePrice() + price);
	}
	
	public Type getType() {
		return Type.SMOOTHIE;
	}
	
	public boolean equals(Smoothie anotherBev) {
		return(super.equals(anotherBev) && this.numOfFruits == anotherBev.numOfFruits && this.addProtein == anotherBev.addProtein);
	}
}
