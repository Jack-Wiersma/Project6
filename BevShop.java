import java.util.ArrayList;

public class BevShop {
	private final int MIN_AGE_FOR_ALCOHOL = 21;
	private final int MAX_ORDER_FOR_ALCOHOL= 3;
	private final int MIN_TIME= 8;
	private final int MAX_TIME= 23;
	private final int MAX_FRUIT = 5;
	private int currentDrinksOrdered = 0;
	private ArrayList<Order> orderList = new ArrayList<Order>();
	
	public BevShop() {
		orderList = null;
	}
	
	public boolean isValidTime(int time) {
		return (time >= MIN_TIME && time <= MAX_TIME);
	}
	
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		return (numOfFruits > MAX_FRUIT);
	}
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore() {
		return(currentDrinksOrdered <= 3); 
	}
	
	public int getNumOfAlcoholDrink() {
		return currentDrinksOrdered;
	}
	
	public boolean isValidAge(int age) {
		return (age >= MIN_AGE_FOR_ALCOHOL);
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		orderList.add(new Order(time, day, new Customer(customerName, customerAge)));
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		orderList.get(currentDrinksOrdered).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processAlcoholOrder(String bevName, Size size) {
		orderList.get(currentDrinksOrdered).addNewBeverage(bevName, size);
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		orderList.get(currentDrinksOrdered).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public int findOrder(int orderNo) {
		sortOrders();
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1;
	}
	
	public double totalOrderPrice(int orderNo) {
		double total = 0;
		total += orderList.get(orderNo).calcOrderTotal();
		return total;
	}
	
	public double totalMonthlySale() {
		double total = 0;
		for (int i = 0; i < orderList.size(); i++) {
			total += orderList.get(i).calcOrderTotal();
		}
		return total;
	}
	
	public int totalNumOfMonthlyOrders() {
		return orderList.size();
	}
	
	public Order getCurrentOrder() {
		return orderList.get(currentDrinksOrdered);
	}
	
	public Order getOrderAtIndex(int index) {
		return orderList.get(index);
	}
	
	public void sortOrders() {
		for (int i = 0; i < orderList.size(); i++) {
			int index = i;
			for (int k = i + 1; k < orderList.size(); k++) {
				if (orderList.get(k).getOrderNo() < orderList.get(index).getOrderNo()) {
					index = k;
				}
			}
			Order min = orderList.get(index);
			orderList.set(index, orderList.get(i));
			orderList.set(i, min);
			
		}
	}
	
	public String toString() {
		String temp = "";
		for (int i = 0; i < orderList.size(); i++) {
			temp += orderList.get(i).toString();
		}
		return (temp + totalMonthlySale());
	}
}
