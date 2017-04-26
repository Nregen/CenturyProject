package SandwichShop;

import java.util.ArrayList;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Receipt extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Menu> menuList = new ArrayList<>();
		
	//create the panels
	private JPanel breadPanel = new JPanel(new GridLayout(8, 1));
	private JPanel meatPanel = new JPanel(new GridLayout(8, 1));
	private JPanel cheesePanel = new JPanel(new GridLayout(8, 1));
	private JPanel toppingsPanel = new JPanel(new GridLayout(8, 1));
	private JPanel sidePanel = new JPanel(new GridLayout(8, 1));
	private JPanel drinkPanel = new JPanel(new GridLayout(8, 1));
	private JPanel orderPanel = new JPanel(new GridLayout(1, 2));
	private JPanel outputPanel = new JPanel(new BorderLayout());
	private JPanel taxPanel = new JPanel(new GridLayout(1, 2));
	private JPanel subTotalPanel = new JPanel(new GridLayout(1, 2));
	private JPanel totalPanel = new JPanel(new GridLayout(1, 2));
	private JPanel topPanel = new JPanel(new GridLayout(1, 6));
	private JPanel centerPanel = new JPanel(new GridLayout(2, 1));
	private JPanel bottomPanel = new JPanel(new GridLayout(3, 1));
	
	
	private JLabel meatLbl = new JLabel("Turkey");
	private JLabel meat1Lbl = new JLabel("Chicken");
	private JLabel meat2Lbl = new JLabel("Vegetarian");
	private JLabel breadLbl = new JLabel("White");
	private JLabel bread1Lbl = new JLabel("Wheat");
	private JLabel bread2Lbl = new JLabel("FlatBread");
	private JLabel cheeseLbl = new JLabel("American");
	private JLabel cheese1Lbl = new JLabel("Cheddar");
	private JLabel cheese2Lbl = new JLabel("Pepper Jack");
	private JLabel toppingLbl = new JLabel("Lettuce");
	private JLabel topping1Lbl = new JLabel("Pickles");
	private JLabel topping2Lbl = new JLabel("Spinach");
	private JLabel topping3Lbl = new JLabel("Olives");
	private JLabel topping4Lbl = new JLabel("Tomato");
	private JLabel topping5Lbl = new JLabel("Onion");	
	private JLabel sideLbl = new JLabel("Cookie");
	private JLabel side1Lbl = new JLabel("Chips");
	private JLabel side2Lbl = new JLabel("Candy Bar");
	private JLabel drinkLbl = new JLabel("Small");
	private JLabel drink1Lbl = new JLabel("Medium");
	private JLabel drink2Lbl = new JLabel("Large");
	
	private JLabel breadDisplayLbl = new JLabel(" BreadType:");
	private JLabel meatDisplayLbl = new JLabel(" Meat Choice:");
	//private JLabel toastedLbl = new JLabel(" Toasted (Enter yes or no):");
	//private JLabel comboLbl = new JLabel(" Combo (Enter yes or no):");
	private JLabel cheeseDisplayLbl = new JLabel("Cheese:");
	private JLabel toppingDisplayLbl = new JLabel("Toppings:");
	private JLabel sideDisplayLbl = new JLabel("Sides:");
	private JLabel drinkDisplayLbl = new JLabel("Drink:");
	
	private JLabel subTotalLbl = new JLabel(" Subtotal:", SwingConstants.RIGHT);
	private JLabel taxLbl = new JLabel(" Tax:", SwingConstants.RIGHT);
	private JLabel totalLbl = new JLabel(" Total:", SwingConstants.RIGHT);
	
	private JButton addToOrderBtn = new JButton("Add to order");
	private JButton completeOrderBtn = new JButton("Complete order");
	
	private JTextField breadFld = new JTextField(20);
	//private JTextField bread1Fld = new JTextField();
	//private JTextField bread2Fld = new JTextField();
	private JTextField meatFld = new JTextField(20);
	//private JTextField meat1Fld = new JTextField();
	//private JTextField meat2Fld = new JTextField();
	private JTextField cheeseFld = new JTextField(20);
	//private JTextField cheese1Fld = new JTextField();
	//private JTextField cheese2Fld = new JTextField();
	private JTextField toppingFld = new JTextField(60);
	//private JTextField topping1Fld = new JTextField();
	//private JTextField topping2Fld = new JTextField();
	//private JTextField topping3Fld = new JTextField();
	//private JTextField topping4Fld = new JTextField();
	//private JTextField topping5Fld = new JTextField();	
	private JTextField sideFld = new JTextField(20);
	//private JTextField side1Fld = new JTextField();
	//private JTextField side2Fld = new JTextField();
	private JTextField drinkFld = new JTextField(20);
	//private JTextField drink1Fld = new JTextField();
	//private JTextField drink2Fld = new JTextField();
	
	
	
	//create the text area for display
	private JTextArea outputField = new JTextArea();
	private JTextArea totalField = new JTextArea();
	private JTextArea subTotalField = new JTextArea();
	private JTextArea taxField = new JTextArea();	
	

	
	public Receipt(String title) {
		super(title);
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 1));

		buildPanels();
		addPanelsToFrame();
		addListeners();
	}
	
	private void addListeners() {
		addToOrderBtn.addActionListener(this);
		completeOrderBtn.addActionListener(this);

	}
	
	private void addPanelsToFrame() {
		this.add(topPanel);
		this.add(centerPanel);
		this.add(bottomPanel);
	}
	
	private void buildPanels() {

		//searchPanel.add(searchField);
		//searchPanel.add(searchBtn);
		
		breadPanel.add(breadDisplayLbl);
		breadPanel.add(breadLbl);
		breadPanel.add(bread1Lbl);
		breadPanel.add(bread2Lbl);
		breadPanel.add(breadFld);
		meatPanel.add(meatDisplayLbl);
		meatPanel.add(meatLbl);
		meatPanel.add(meat1Lbl);
		meatPanel.add(meat2Lbl);
		meatPanel.add(meatFld);
		cheesePanel.add(cheeseDisplayLbl);
		cheesePanel.add(cheeseLbl);
		cheesePanel.add(cheese1Lbl);
		cheesePanel.add(cheese2Lbl);
		cheesePanel.add(cheeseFld);
		toppingsPanel.add(toppingDisplayLbl);
		toppingsPanel.add(toppingLbl);
		toppingsPanel.add(topping1Lbl);
		toppingsPanel.add(topping2Lbl);
		toppingsPanel.add(topping3Lbl);
		toppingsPanel.add(topping4Lbl);
		toppingsPanel.add(topping5Lbl);
		toppingsPanel.add(toppingFld);
		sidePanel.add(sideDisplayLbl);
		sidePanel.add(sideLbl);
		sidePanel.add(side1Lbl);
		sidePanel.add(side2Lbl);
		sidePanel.add(sideFld);
		drinkPanel.add(drinkDisplayLbl);
		drinkPanel.add(drinkLbl);
		drinkPanel.add(drink1Lbl);
		drinkPanel.add(drink2Lbl);
		drinkPanel.add(drinkFld);
		
		orderPanel.add(addToOrderBtn);
		orderPanel.add(completeOrderBtn);
		outputPanel.add(outputField);		
		
		subTotalPanel.add(subTotalLbl);
		subTotalPanel.add(subTotalField);
		taxPanel.add(taxLbl);
		taxPanel.add(taxField);
		totalPanel.add(totalLbl);
		totalPanel.add(totalField);

		topPanel.add(breadPanel, BorderLayout.CENTER);
		topPanel.add(meatPanel, BorderLayout.CENTER);
		topPanel.add(cheesePanel, BorderLayout.CENTER);
		topPanel.add(toppingsPanel, BorderLayout.CENTER);
		topPanel.add(sidePanel, BorderLayout.CENTER);
		topPanel.add(drinkPanel, BorderLayout.CENTER);

		centerPanel.add(orderPanel, BorderLayout.NORTH);
		centerPanel.add(outputPanel, BorderLayout.CENTER);
		
		bottomPanel.add(subTotalPanel, BorderLayout.NORTH);
		bottomPanel.add(taxPanel, BorderLayout.CENTER);
		bottomPanel.add(totalPanel, BorderLayout.SOUTH);		
	}
	
	public static void main(String[] args) {
		Receipt gui = new Receipt("Sandwich Shop");
		gui.setVisible(true);

	}

	//create the actions for the listeners
	@Override
	public void actionPerformed(ActionEvent e) {
		String callingBtn = e.getActionCommand();

		if (callingBtn.equals("Add to order")) {
			String bread = breadFld.getText();
			String meat = meatFld.getText();
			String cheese = cheeseFld.getText();	
			String topping = toppingFld.getText();
			String side = sideFld.getText();
			String drink = drinkFld.getText();

			Menu menu = new Menu(bread, meat, cheese, topping, side, drink);
			menuList.add(menu);
			outputField.append("Current order: " + bread + " "+ meat + " " + cheese + " " 
								+ topping + " " + side + " " + drink + "\n");
		}else if (callingBtn.equals("Complete order")) {
				for (Menu order: menuList){
						outputField.append("Your " + order + " was place.\n");
				}outputField.append("Please pay the total due.\n");
		}
	}

	
	
	
}
