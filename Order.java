import java.text.NumberFormat;
import java.util.ArrayList;
//Order class
public class Order {
	//create arraylist for meal
	private ArrayList<Meal> order;
	//constructor
	public Order(){
		this.order = new ArrayList<>();
	}
	//method to add meals to order arraylist
	public void addOrder(Meal meal){
		order.add(meal);
	}
	//method to clear order
	public void removeOrder(){
		for(Meal meal : order){
			order.remove(meal);
		}
		order.clear();
	}
	//order toString method
	@Override
	public String toString() {
		return order.toString();
	}
	//method to get price of sandwiches
	public double getSandwichPrice(){
		int numOfSandwiches = 0;
		for(Meal meal : order){
			numOfSandwiches += meal.getSandwiches();
		}
		double sandwichPrice = numOfSandwiches * 5.00;
		return sandwichPrice;
	}
	//method to get price of sides
	public double getSidePrice(){
		double sidePrice = 0;
		for(Meal meal : order){
			if(meal.getSide().equals("Chips")){
				sidePrice += 1.00;
			}else if(meal.getSide().equals("Cookie")){
				sidePrice += 1.00;
			}else if(meal.getSide().equals("Pickle")){
				sidePrice += 1.00;
			}
		}
		return sidePrice;
	}
	//method to get price of drinks
	public double getDrinkPrice(){
		double drinkPrice = 0;
		for(Meal meal : order){
			if(meal.getDrink().equals("Sm Drink")){
				drinkPrice += 0.50;
			}else if(meal.getDrink().equals("Md Drink")){
				drinkPrice += 1.00;
			}else if(meal.getDrink().equals("Lg Drink")){
				drinkPrice += 1.50;
			}
		}
		return drinkPrice;
	}
	//method to get total price
	public double getTotalPrice(){
		double totalPrice = getSandwichPrice() + getSidePrice() + getDrinkPrice();
		return totalPrice;
	}
	//method to display prices including total
	public String displayPrice(){
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		return "Sandwich(es) Price: " + moneyFormat.format(getSandwichPrice()) + "\nSide(s) Price: " + moneyFormat.format(getSidePrice()) + 
				"\nDrink(s) Price: " + moneyFormat.format(getDrinkPrice()) + "\n\n Total Price: " + moneyFormat.format(getTotalPrice());
	}
}
