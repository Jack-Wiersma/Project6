import java.util.ArrayList;
import java.lang.Math;

public class Order {
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> listOfBeverages = new ArrayList<Beverage>();
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		customer = cust;
	}
	
	public int generateOrder() {
		return ((int)(Math.random() * 80000 + 10000));
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Day getDay() {
		return orderDay;
	}
	
	public boolean isWeekend() {
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
			return true;
		}
		return false;
	}
	
	public Beverage getBeverage(int itemNo) {
		return listOfBeverages.get(itemNo);
	}
	
	public int getTotalItems() {
		return (listOfBeverages.size());
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		listOfBeverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
	public void addNewBeverage(String bevName, Size size) {
		listOfBeverages.add(new Alcohol(bevName, size, isWeekend()));
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		listOfBeverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	
	public double calcOrderTotal() {
		double total = 0;
		for (int i = 0; i < listOfBeverages.size(); i++) {
			total += listOfBeverages.get(i).calcPrice();
		}
		return total;
	}
	
	public int findNumOfBeveType(Type type) {
		int counter = 0;
		for (int i = 0; i < listOfBeverages.size(); i++) {
			if (listOfBeverages.get(i).getType().equals(type)) {
				counter++;
			}
		}
		return counter;
	}
	
	public String toString() {
		return (orderNo + " " + orderTime + " " + orderDay + " " + customer.toString());
	}
	
	public int compareTo(Order anotherOrder) {
		if (this.orderNo > anotherOrder.orderNo) {
			return 1;
		} else if (this.orderNo < anotherOrder.orderNo) {
			return -1;
		} else
			return 0;
	}
}
