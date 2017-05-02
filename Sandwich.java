import java.util.ArrayList;
//Sandwich class
public class Sandwich {
	//sandwich options and topping arraylist
	private String breadType;
	private String meat;
	private String cheese;
	private ArrayList<Toppings> toppings;
	//constructor
	public Sandwich(String breadType, String meat, String cheese, Toppings toppings) {
		this.breadType = breadType;
		this.meat = meat;
		this.cheese = cheese;
		this.toppings = new ArrayList<>();
	}
	//getters and setters
	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	public void addToppings(Toppings topping){
		toppings.add(topping);
	}
	//sandwich toString method
	@Override
	public String toString() {
		return breadType + "\t" + meat + "\t" + cheese + "\t" + toppings.toString();
	}
	
}
