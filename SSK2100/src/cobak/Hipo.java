package cobak;

import java.util.*;
import javax.swing.JOptionPane;
public class Hipo{
	public static void main(String[] args) {
		String pc = JOptionPane.showInputDialog(null, "Please enter your postcode to check whether \nyour suburb qualifies for super shipping discount:)", "DELIVERY CHARGE", JOptionPane.QUESTION_MESSAGE);
		Scanner input = new Scanner(System.in);
		
		final double TshirtPrice = 10.00;
		final double TrouserPrice = 20.00;
		int numOfShirts = 0;
		int numOfTrousers = 0;
		int postcode = Integer.parseInt(pc);
		double discount = 0.05;
		double normalShipping = 19.55;
		double actualShipping;
		String msg;
		String repeatingMsg = "Congratulations!\nYou qualify for the super special shipping fee discount of ";
		
		switch (postcode) {
			case 43650:
				msg = "You are from Bangi! " + repeatingMsg;
				normalShipping = 10.00;
				discount = 0.7500;
				actualShipping = normalShipping*(1-discount);
				break;
			case 43000:
				msg = "You are from Kajang! " + repeatingMsg;
				normalShipping = 15.00;
				discount = 0.8500;
				actualShipping = normalShipping*(1-discount);
				break;
			case 43400:
				msg = "You are from Serdang! " + repeatingMsg;
				normalShipping = 25.00;
				discount = 1.00;
				actualShipping = normalShipping*(1-discount);
				break;
			default:
				msg = "Your suburb does not qualify for any shipping fee discount.\nWe however still offer a shipping discount of";
				actualShipping = normalShipping*(1-discount);
				break;
		}
		
		System.out.printf("%s %.2f%%.%n", msg, discount*100);
		System.out.printf("Your final shipping fee is RM%.2f. %n(Normal shipping fee is RM%.2f).%n%n", actualShipping, normalShipping);
		System.out.println("============= ENTER ORDER =============");
		
		int done = 0;
		
		while (done==0) {
			System.out.println("Number of t-shirts to purchase? You can only buy up to 4 t-shirts: ");
			numOfShirts = input.nextInt();
			System.out.println("Number of trousers to purchase? Again, max. 4 items: ");
			numOfTrousers = input.nextInt();
			
			if ((numOfShirts <= 4) && (numOfShirts >= 0) && (numOfTrousers <= 4) && (numOfTrousers >= 0)) {
				done = 1;
				System.out.println("You have ordered " + numOfShirts + " t-shirts and " + numOfTrousers + " trousers.");
				System.out.println("Thanks for your oder. Total price including shipping:");
				System.out.printf("RM%.2f. Please come again!!!", ((numOfShirts * TshirtPrice + numOfTrousers * TrouserPrice) +
				actualShipping));
			}
			else
			System.out.println("At most 4... and of course, plz enter a positive number...");
		}
	}
}