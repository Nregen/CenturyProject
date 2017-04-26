package SandwichShop;

public class Menu {
	
	private boolean combo;
	private boolean toasted;
	private String bread;
	private String cheese;
	private String topping;
	private String drink;
	private String meat;
	private String side;
	

	public Menu(String bread, String meat, String cheese, String topping, String side, String drink) {
		//create the default constructor for the Menu
		super();
		this.bread = bread;
		this.meat = meat;
		this.cheese = cheese;
		this.topping = topping;
		this.side = side;
		this.drink = drink;		
	}
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String getCheese() {
		return cheese;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getToppings() {
		return topping;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}

	public boolean isCombo() {
		return combo;
	}
	public void setCombo(boolean combo) {
		this.combo = combo;
	}
	public boolean isToasted() {
		return toasted;
	}
	public void setToasted(boolean toasted) {
		this.toasted = toasted;
	}

	@Override
	public String toString() {
		return "bread= " + bread + ", meat= " + meat 
				+ ", cheese= " + cheese + ", topping= " + topping 
				+ ", drink= " + drink + ",  side= " + side;
	}
	
	
	
}
