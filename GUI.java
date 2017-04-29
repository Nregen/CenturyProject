
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class GUI extends JFrame implements ActionListener{
	
	private Toppings topping1 = new Toppings();
	private Toppings topping2 = new Toppings();
	private Toppings topping3 = new Toppings();
	private Toppings topping4 = new Toppings();
	private Toppings topping5 = new Toppings();
	private Toppings topping6 = new Toppings();
	private Sandwich sandwich = new Sandwich();
	private Meal meal = new Meal();
	private Order order = new Order();
	
	private JPanel topPanel = new JPanel(new GridLayout(4,7));
	private JPanel bottomPanel = new JPanel(new BorderLayout());
	private JPanel addOrderPanel = new JPanel(new FlowLayout());
	private JPanel textAreaPanel = new JPanel(new BorderLayout());
	private JPanel submitOrderPanel = new JPanel(new FlowLayout());
	
	private JLabel breadTypeLbl = new JLabel("Bread Type", SwingConstants.CENTER);
	private JLabel meatLbl = new JLabel("Meat", SwingConstants.CENTER);
	private JLabel cheeseLbl = new JLabel("Cheese", SwingConstants.CENTER);
	private JLabel toppingsLbl = new JLabel("Toppings", SwingConstants.CENTER);
	private JLabel blankLbl = new JLabel("", SwingConstants.CENTER);
	private JLabel sidesLbl = new JLabel("Sides", SwingConstants.CENTER);
	private JLabel drinksLbl = new JLabel("Drink", SwingConstants.CENTER);
	
	private JTextArea outputField = new JTextArea();
		
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
	
	private JButton[] bread = {bread1Btn, bread2Btn, bread3Btn};
	
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
	private void addPanels(){
		this.add(topPanel);
		this.add(bottomPanel);
	}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		String callingBtn = e.getActionCommand();
		
		if(callingBtn.equals("White")){
			sandwich.setBreadType("White");
			outputField.setText(sandwich.getBreadType());
		}else if(callingBtn.equals("Wheat")){
			sandwich.setBreadType("Wheat");
			outputField.setText(sandwich.getBreadType());
		}else if(callingBtn.equals("Whole Grain")){
			sandwich.setBreadType("Whole Grain");
			outputField.setText(sandwich.getBreadType());
		}else if(callingBtn.equals("Turkey")){
			sandwich.setMeat("Turkey");
			outputField.setText(sandwich.getMeat());
		}else if(callingBtn.equals("Ham")){
			sandwich.setMeat("Ham");
			outputField.setText(sandwich.getMeat());
		}else if(callingBtn.equals("Bacon")){
			sandwich.setMeat("Bacon");
			outputField.setText(sandwich.getMeat());
		}else if(callingBtn.equals("Cheddar")){
			sandwich.setCheese("Cheddar");
			outputField.setText(sandwich.getCheese());
		}else if(callingBtn.equals("Swiss")){
			sandwich.setCheese("Swiss");
			outputField.setText(sandwich.getCheese());
		}else if(callingBtn.equals("Pepper Jack")){
			sandwich.setCheese("Pepper Jack");
			outputField.setText(sandwich.getCheese());
		}else if(callingBtn.equals("Lettuce")){
			topping1.setToppings("Lettuce");
			sandwich.addToppings(topping1);
			outputField.setText(topping1.getToppings());
		}else if(callingBtn.equals("Tomato")){
			topping2.setToppings("Tomato");
			sandwich.addToppings(topping2);
			outputField.setText(topping2.getToppings());
		}else if(callingBtn.equals("Onion")){
			topping3.setToppings("Onion");
			sandwich.addToppings(topping3);
			outputField.setText(topping3.getToppings());
		}else if(callingBtn.equals("Peppers")){
			topping4.setToppings("Peppers");
			sandwich.addToppings(topping4);
			outputField.setText(topping4.getToppings());
		}else if(callingBtn.equals("Mayo")){
			topping5.setToppings("Mayo");
			sandwich.addToppings(topping5);
			outputField.setText(topping5.getToppings());
		}else if(callingBtn.equals("Mustard")){
			topping6.setToppings("Mustard");
			sandwich.addToppings(topping6);
			outputField.setText(topping6.getToppings());
		}else if(callingBtn.equals("Chips")){
			meal.setSide("Chips");
			outputField.setText(meal.getSide());
		}else if(callingBtn.equals("Cookie")){
			meal.setSide("Cookie");
			outputField.setText(meal.getSide());
		}else if(callingBtn.equals("Pickle")){
			meal.setSide("Pickle");
			outputField.setText(meal.getSide());
		}else if(callingBtn.equals("Small")){
			meal.setDrink("Sm Drink");
			outputField.setText(meal.getDrink());
		}else if(callingBtn.equals("Medium")){
			meal.setDrink("Md Drink");
			outputField.setText(meal.getDrink());
		}else if(callingBtn.equals("Large")){
			meal.setDrink("Lg Drink");
			outputField.setText(meal.getDrink());
		}else if(callingBtn.equals("Add To Order")){
			meal.addSandwich(sandwich);
			order.addOrder(meal);
			outputField.setText(order.displayOrder());
		}else if(callingBtn.equals("Clear")){
			topping1.setToppings("");
			topping2.setToppings("");
			topping3.setToppings("");
			topping4.setToppings("");
			topping5.setToppings("");
			topping6.setToppings("");
			sandwich.setBreadType("");
			sandwich.setMeat("");
			sandwich.setCheese("");
			meal.setSide("");
			meal.setDrink("");
			order.removeOrder();
			outputField.setText("Sandwich: $5.00\nSide: $1.00\nDrinks\tSm: $0.50\tMd: $1.00\tLg: $1.50\n\n");
		}else if(callingBtn.equals("Submit Order")){
			
		}
	}
	public static void main(String[] args){
		GUI gui = new GUI("Sandwich Shop");
		gui.setVisible(true);
	}
}
