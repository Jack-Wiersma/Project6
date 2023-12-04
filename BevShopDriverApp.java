/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Due: 12/3/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Jack Wiersma
 */

import java.util.Scanner;

public class BevShopDriverApp {
	public static void main(String[] args) {
		String name;
		int age;
		BevShop obj = new BevShop();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			Customer cust;
			System.out.println("The current order in process can have at most " + obj.getMaxOrderForAlcohol() + " alcoholic beverages.");
			System.out.println("The minimum age to order alcohol drink is " + obj.getMinAgeForAlcohol());
			System.out.println("New order:");
			System.out.println("Would you please enter your name ");	
			name = scan.nextLine();
			System.out.println("Would you please enter your age ");			
			age = scan.nextInt();
			cust = new Customer(name, age);
			if (cust.getAge() > obj.getMinAgeForAlcohol()) {
				System.out.println("Your age is above 20 and you are eligible to order alcohol");
			}
			
		}
		
	}
}
