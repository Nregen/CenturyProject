
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
//gui class
public class GUI extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1379527667830747185L;
	//create instance of order
	private Order order = new Order();
	//variables to send to constructors
	private String breadType = "";
	private String meat = "";
	private String cheese = "";
	private String top1 = "";
	private String top2 = "";
	private String top3 = "";
	private String top4 = "";
	private String top5 = "";
	private String top6 = "";
	private String side = "";
	private String drink = "";
	//create panels
	private JPanel topPanel = new JPanel(new GridLayout(4,7));
	private JPanel bottomPanel = new JPanel(new BorderLayout());
	private JPanel addOrderPanel = new JPanel(new FlowLayout());
	private JPanel textAreaPanel = new JPanel(new BorderLayout());
	private JPanel submitOrderPanel = new JPanel(new FlowLayout());
	//create labels
	private JLabel breadTypeLbl = new JLabel("Bread Type", SwingConstants.CENTER);
	private JLabel meatLbl = new JLabel("Meat", SwingConstants.CENTER);
	private JLabel cheeseLbl = new JLabel("Cheese", SwingConstants.CENTER);
	private JLabel toppingsLbl = new JLabel("Toppings", SwingConstants.CENTER);
	private JLabel blankLbl = new JLabel("", SwingConstants.CENTER);
	private JLabel sidesLbl = new JLabel("Sides", SwingConstants.CENTER);
	private JLabel drinksLbl = new JLabel("Drink", SwingConstants.CENTER);
	//output textfield
	private JTextArea outputField = new JTextArea();
	//create buttons
	private JButton bread1Btn = new JButton("White");
	private JButton bread2Btn = new JButton("Wheat");
	private JButton bread3Btn = new JButton("Whole Grain");
	private JButton meat1Btn = new JButton("Turkey");
	private JButton meat2Btn = new JButton("Ham");
	private JButton meat3Btn = new JButton("Bacon");
	private JButton cheese1Btn = new JButton("Cheddar");
	private JButton cheese2Btn = new JButton("Swiss");
	private JButton cheese3Btn = new JButton("Pepper Jack");
	private JButton topping1Btn = new JButton("Lettuce");
	private JButton topping2Btn = new JButton("Tomato");
	private JButton topping3Btn = new JButton("Onion");
	private JButton topping4Btn = new JButton("Peppers");
	private JButton topping5Btn = new JButton("Mayo");
	private JButton topping6Btn = new JButton("Mustard");
	private JButton side1Btn = new JButton("Chips");
	private JButton side2Btn = new JButton("Cookie");
	private JButton side3Btn = new JButton("Pickle");
	private JButton drink1Btn = new JButton("Small");
	private JButton drink2Btn = new JButton("Medium");
	private JButton drink3Btn = new JButton("Large");
	private JButton addOrderBtn = new JButton("Add To Order");
	private JButton clearBtn = new JButton("Clear");
	private JButton submitOrderBtn = new JButton("Submit Order");
	//gui constructor
	public GUI(String title){
		super(title);
		this.setSize(1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2,1));
		buildPanels();
		addPanels();
		addListeners();
		outputField.setText("Sandwich: $5.00\nSide: $1.00\nDrinks\tSm: $0.50\tMd: $1.00\tLg: $1.50\n\n");
	}
	//method to build panels
	private void buildPanels(){
		
		topPanel.add(breadTypeLbl);
		topPanel.add(meatLbl);
		topPanel.add(cheeseLbl);
		topPanel.add(toppingsLbl);
		topPanel.add(blankLbl);
		topPanel.add(sidesLbl);
		topPanel.add(drinksLbl);
		topPanel.add(bread1Btn);
		topPanel.add(meat1Btn);
		topPanel.add(cheese1Btn);
		topPanel.add(topping1Btn);
		topPanel.add(topping4Btn);
		topPanel.add(side1Btn);
		topPanel.add(drink1Btn);
		topPanel.add(bread2Btn);
		topPanel.add(meat2Btn);
		topPanel.add(cheese2Btn);
		topPanel.add(topping2Btn);
		topPanel.add(topping5Btn);
		topPanel.add(side2Btn);
		topPanel.add(drink2Btn);
		topPanel.add(bread3Btn);
		topPanel.add(meat3Btn);
		topPanel.add(cheese3Btn);
		topPanel.add(topping3Btn);
		topPanel.add(topping6Btn);
		topPanel.add(side3Btn);
		topPanel.add(drink3Btn);
				
		addOrderPanel.add(addOrderBtn);
		addOrderPanel.add(clearBtn);
		
		textAreaPanel.add(outputField);
		
		submitOrderPanel.add(submitOrderBtn);
		
		bottomPanel.add(addOrderPanel, BorderLayout.NORTH);
		bottomPanel.add(textAreaPanel, BorderLayout.CENTER);
		bottomPanel.add(submitOrderPanel, BorderLayout.SOUTH);
	}
	//method to add panels to frame
	private void addPanels(){
		this.add(topPanel);
		this.add(bottomPanel);
	}
	//method to add listeners to buttons
	private void addListeners(){
		bread1Btn.addActionListener(this);
		bread2Btn.addActionListener(this);
		bread3Btn.addActionListener(this);
		meat1Btn.addActionListener(this);
		meat2Btn.addActionListener(this);
		meat3Btn.addActionListener(this);
		cheese1Btn.addActionListener(this);
		cheese2Btn.addActionListener(this);
		cheese3Btn.addActionListener(this);
		topping1Btn.addActionListener(this);
		topping2Btn.addActionListener(this);
		topping3Btn.addActionListener(this);
		topping4Btn.addActionListener(this);
		topping5Btn.addActionListener(this);
		topping6Btn.addActionListener(this);
		side1Btn.addActionListener(this);
		side2Btn.addActionListener(this);
		side3Btn.addActionListener(this);
		drink1Btn.addActionListener(this);
		drink2Btn.addActionListener(this);
		drink3Btn.addActionListener(this);
		addOrderBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		submitOrderBtn.addActionListener(this);
	}
	//set actions for buttons
	@Override
	public void actionPerformed(ActionEvent e) {
		String callingBtn = e.getActionCommand();
		
		if(callingBtn.equals("White")){
			breadType = "White";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Wheat")){
			breadType = "Wheat";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Whole Grain")){
			breadType = "Whole Grain";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Turkey")){
			meat = "Turkey";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Ham")){
			meat = "Ham";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Bacon")){
			meat = "Bacon";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Cheddar")){
			cheese = "Cheddar";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Swiss")){
			cheese = "Swiss";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Pepper Jack")){
			cheese = "Pepper Jack";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Lettuce")){
			top1 = "Lettuce";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Tomato")){
			top2 = "Tomato";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Onion")){
			top3 = "Onion";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Peppers")){
			top4 = "Peppers";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Mayo")){
			top5 = "Mayo";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Mustard")){
			top6 = "Mustard";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Chips")){
			side = "Chips";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Cookie")){
			side = "Cookie";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Pickle")){
			side = "Pickle";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Small")){
			drink = "Sm Drink";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Medium")){
			drink = "Md Drink";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Large")){
			drink = "Lg Drink";
			outputField.setText(breadType + "\t" + meat + "\t" + cheese + "\t" + top1 + "\t" + top2 + "\t" + top3 + "\t" + top4 + "\t" + top5 + "\t" + top6 
					+ "\n" + side + "\n" + drink + "\n");
		}else if(callingBtn.equals("Add To Order")){
			Toppings toppings = new Toppings(top1, top2, top3, top4, top5, top6);
			Sandwich sandwich = new Sandwich(breadType, meat, cheese, toppings);
			Meal meal = new Meal(sandwich, side, drink);
			sandwich.addToppings(toppings);
			meal.addSandwich(sandwich);
			order.addOrder(meal);
			outputField.setText(order.toString());
			breadType = "";
			meat = "";
			cheese = "";
			top1 = "";
			top2 = "";
			top3 = "";
			top4 = "";
			top5 = "";
			top6 = "";
			side = "";
			drink = "";
		}else if(callingBtn.equals("Clear")){
			breadType = "";
			meat = "";
			cheese = "";
			top1 = "";
			top2 = "";
			top3 = "";
			top4 = "";
			top5 = "";
			top6 = "";
			side = "";
			drink = "";
			order.removeOrder();
			outputField.setText("Sandwich: $5.00\nSide: $1.00\nDrinks\tSm: $0.50\tMd: $1.00\tLg: $1.50\n\n");
		}else if(callingBtn.equals("Submit Order")){
			outputField.setText(order.toString());
			outputField.append("\n" + order.displayPrice());
		}
	}
	//main method to start gui
	public static void main(String[] args){
		GUI gui = new GUI("Sandwich Shop");
		gui.setVisible(true);
	}
}
