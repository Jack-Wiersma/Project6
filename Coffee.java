public class Coffee extends Beverage {
	private boolean extraShot;
	private boolean extraSyrup;
	
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	public double calcPrice() {
		double price = 0;
		if (extraShot)
			price += 0.5;
		if (extraSyrup)
			price += 0.5;
		if (super.getSize().equals(Size.MEDIUM)) {
			price++;
		} else if (super.getSize().equals(Size.LARGE)) {
			price += 2;
		}
		return (price += super.getBasePrice());
	}
	
	public Type getType() {
		return Type.COFFEE;
	}
	
	public String toString() {
		return(super.toString() + " " + extraShot + " " + extraSyrup + calcPrice());
	}
	
	public boolean equals(Coffee anotherBev) {
		return (super.equals(anotherBev) && this.extraShot == anotherBev.extraShot && this.extraSyrup == anotherBev.extraSyrup);
	}
}
