import java.util.ArrayList;
//Meal class
public class Meal {
	//meal options and sandwich arraylist
	private String side;
	private String drink;
	private ArrayList<Sandwich> sandwiches;
	//constructor
	public Meal(Sandwich sandwich, String side, String drink) {
		this.side = side;
		this.drink = drink;
		this.sandwiches = new ArrayList<>();
	}
	//getters and setters
	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}
	//method to get number of sandwiches to calculate price later
	public int getSandwiches(){
		int numOfSandwiches = 0;
		for(Sandwich sandwich : sandwiches){
			if(sandwich.equals(sandwich));
			numOfSandwiches += 1;
		}
		return numOfSandwiches;
	}
	//method to add sandwiches to arraylist
	public void addSandwich(Sandwich sandwich){
		sandwiches.add(sandwich);
	}
	//meal toString method
	@Override
	public String toString() {
		return sandwiches.toString() + "\t" + side +"\t" + drink + "\n";
	}
}
