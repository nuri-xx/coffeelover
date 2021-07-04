package troxion_coffee;

import javax.swing.*;

public class Troxion_coffee {

	public static void main(String[] args) {
		
		//Variable declaration
		double coffee_price;
		double box_price;
		double box_costs = 0;
		double total_price;
		int total_bags;
		int box_capacity = 0;
		int total_box;
		char type;
		String box_type = "";
		
		//Welcome message
		JOptionPane.showMessageDialog(null, "Welcome to Troxion Coffee, where coffee is not just coffee… but kopi");
		
		//Ask user to continue with the order
		int a=JOptionPane.showConfirmDialog(null, "Do you need some coffee bags to put in your kitchen?");
		if(a==JOptionPane.YES_OPTION) {
			do {
				//Ask user to input number of bags
				String input = JOptionPane.showInputDialog(null, "Enter number of coffee bags(multiple of 10): ");
				
				//Converting Strings to Integer
				total_bags = Integer.parseInt(input);
				
				//Check whether the total_bags input valid or not
				if ((total_bags % 10 != 0) || (total_bags<1)) {
					//Show error message
					JOptionPane.showMessageDialog(null, "Coffee bags must be multiple of 10.", "Error", JOptionPane.WARNING_MESSAGE);
				} else do {
					
					//Show box_type details
					JOptionPane.showMessageDialog(null, "You can choose three types of boxes:\na) Large box: fits 20-bags, the box costs RM2.00\nb) Medium box: fits 10-bags, the box costs RM1.50\nc) Small box: fits 5-bags, the box costs RM1.00");
					
					//Ask user to choose type of box
					String string = JOptionPane.showInputDialog(null, "Enter types of box (S, M, or L): ");
					
					//Convert String to Char
					type = string.charAt(0);
					
					//Check whether the box_type input is valid
					 if (type=='S' ^ type=='s' ^ type=='M' ^ type=='m' ^ type=='L' ^ type=='l') {
						 switch (type) {
							case 'S': case 's':
									//Transaction Approved. Assigning the values to variables
									JOptionPane.showMessageDialog(null, "Transaction Approved");
									box_type = "SMALL BOXES";
									box_capacity = 5;
									box_costs = 1;
									break;
							case 'M': case 'm':
									//Transaction Approved. Assigning the values to variables
							        JOptionPane.showMessageDialog(null, "Transaction Approved");
									box_type = "MEDIUM BOXES";
									box_capacity = 10;
									box_costs = 1.5;
									break;
							case 'L': case 'l':
									//Transaction Approved. Assigning the values to variables
									JOptionPane.showMessageDialog(null, "Transaction Approved");
									box_type = "LARGE BOXES";
									box_capacity = 20;
									box_costs = 2;
									break;
							}
						 							
						}else {
							JOptionPane.showMessageDialog(null, "Box type must be (S, M, L) or (s, m, l)", "Error", JOptionPane.WARNING_MESSAGE);
							
							}
					 
					//Loop for box_type if input not valid
					} while (!(type=='S' ^ type=='s' ^ type=='M' ^ type=='m' ^ type=='L' ^ type=='l'));
			//Loop for total_bags if input not valid
			}while ((total_bags % 10 != 0) || (total_bags<1));
			
			//Some calculations :D hehe
			total_box = total_bags / box_capacity;
			coffee_price = total_bags * 10;
			box_price = total_box * box_costs;
			total_price = box_price + coffee_price;
			
			//Reciept
			System.out.printf("******************************************\n");
			System.out.printf("******************************************\n");
			System.out.printf("Expect %d-%s to be delivered.\n", total_box, box_type);
			System.out.printf("COFFEE (RM10 X %d-bags): RM%,.2f\n", total_bags, coffee_price);
			System.out.printf("%s (RM%.2f X %d): RM%.2f\n", box_type, box_costs, total_box, box_price);
			System.out.printf("******************************************\n");
			System.out.printf("******************************************\n");
			System.out.printf("TOTAL (TO BE PAID VIA PAYPAL): RM%,.2f\n", total_price);
			System.out.printf("******************************************\n");
			System.out.printf("******************************************\n");
			System.out.printf("******************************************\n");
			System.out.printf("Troxion Coffee, where coffee is not just coffee… but kopi");
		}

	}

}