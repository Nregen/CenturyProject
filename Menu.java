package SandwichShop;

public class Menu {
	
	private boolean combo;
	private boolean toasted;
	private String bread;
	private String sandwichType;
	private String toppings;
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
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public String getSandwichType() {
		return sandwichType;
	}
	public void setSandwichType(String sandwichType) {
		this.sandwichType = sandwichType;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	@Override
	public String toString() {
		return "sandwichType: " + sandwichType 
				+ "\ncombo y/n: " + combo 
				+ "\ntoasted: " + toasted 
				+ "\nbread: " + bread 
				+ "\ntoppings: " + toppings + "\n";
	}
	
	
	
}
