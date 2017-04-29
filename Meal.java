import java.util.ArrayList;

public class Meal {
	
	private String side;
	private String drink;
	private ArrayList<Sandwich> sandwiches;
	
	public Meal() {
		this.side = side;
		this.drink = drink;
		this.sandwiches = new ArrayList<>();
	}

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
	
	public void addSandwich(Sandwich sandwich){
		sandwiches.add(sandwich);
	}

	@Override
	public String toString() {
		return sandwiches.toString() + "\t" + side +"\t" + drink + "\n";
	}
	
}
