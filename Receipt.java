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


public class Receipt {

	private ArrayList<Menu> menuList;
	
	public Receipt(){
		menuList = new ArrayList<>();		
	}
	
	private JButton meatBtn = new JButton("Turkey");
	private JButton meat1Btn = new JButton("Ham");
	private JButton meat2Btn = new JButton("Chicken");
	private JButton meat0Btn = new JButton("Vegetarian");
	private JButton breadBtn = new JButton("White");
	private JButton bread1Btn = new JButton("Wheat");
	
	private JLabel typeLbl = new JLabel(" Sandwich Type:");
	private JLabel breadLbl = new JLabel(" BreadType:");
	private JLabel toastedLbl = new JLabel(" Toasted (Enter yes or no):");
	private JLabel comboLbl = new JLabel(" Combo (Enter yes or no):");
	private JLabel toppingsLbl = new JLabel("  Enter your topping (seperated by a space):");
	private JLabel subTotalLbl = new JLabel(" Subtotal:");
	private JLabel taxLbl = new JLabel(" Tax:");
	private JLabel totalLbl = new JLabel(" Total:");
	
	public static void main(String[] args) {
		

	}

	
	
	
}
