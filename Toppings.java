//Toppings class
public class Toppings {
	//6 topping options
	private String top1;
	private String top2;
	private String top3;
	private String top4;
	private String top5;
	private String top6;
	//constructor
	public Toppings(String top1, String top2, String top3, String top4, String top5, String top6) {
		this.top1 = top1;
		this.top2 = top2;
		this.top3 = top3;
		this.top4 = top4;
		this.top5 = top5;
		this.top6 = top6;
	}
	//getters and setters
	public String getTop1() {
		return top1;
	}

	public void setTop1(String top1) {
		this.top1 = top1;
	}

	public String getTop2() {
		return top2;
	}

	public void setTop2(String top2) {
		this.top2 = top2;
	}

	public String getTop3() {
		return top3;
	}

	public void setTop3(String top3) {
		this.top3 = top3;
	}

	public String getTop4() {
		return top4;
	}

	public void setTop4(String top4) {
		this.top4 = top4;
	}

	public String getTop5() {
		return top5;
	}

	public void setTop5(String top5) {
		this.top5 = top5;
	}

	public String getTop6() {
		return top6;
	}

	public void setTop6(String top6) {
		this.top6 = top6;
	}
	//topping toString method
	@Override
	public String toString() {
		return top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6;
	}

}
