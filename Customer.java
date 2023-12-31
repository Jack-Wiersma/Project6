public class Customer {
	private int age;
	private String name;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer c) {
		age = c.age;
		name = c.name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return(name + " " + age);
	}
}
