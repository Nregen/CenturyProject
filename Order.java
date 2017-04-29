import java.util.ArrayList;

public class Order {
	
	private ArrayList<Meal> order;
	
	public Order(){
		this.order = new ArrayList<>();
	}
	
	public void addOrder(Meal meal){
		order.add(meal);
	}
	
	public void removeOrder(){
		for(Meal meal : order){
			order.remove(meal);
		}
	}
	
	public String displayOrder(){
		return order.toString();
	}
}
