package Coba;

import java.util.*;
import javax.swing.JOptionPane;

public class Soalan1{
	
	public static void main(String[] args) {
		
		String pc = JOptionPane.showInputDialog(null, "Please enter your postcode to check whether \nyour suburb qualifies for super shipping discount:)", "DELIVERY CHARGE", JOptionPane.QUESTION_MESSAGE);
		int postcode = Integer.parseInt(pc);
		
		getDiscount(postcode);
		getQuantity(postcode);
		
	}

	public static void getDiscount(int postcode) {
			
		double discount = 0.05;
		double normalShipping = 19.55;
		double actualShipping = 0;
		String msg = "";
		String repeatingMsg = "Congratulations!\nYou qualify for the super special shipping fee discount of ";

		switch (postcode) {
		case 43650:
			msg = "You are from Bangi! " + repeatingMsg;
			normalShipping = 10.00;
			discount = 0.7500;
			actualShipping = getShippingPrice(postcode);
			break;
		case 43000:
			msg = "You are from Kajang! " + repeatingMsg;
			normalShipping = 15.00;
			discount = 0.8500;
			actualShipping = getShippingPrice(postcode);
			break;
		case 43400:
			msg = "You are from Serdang! " + repeatingMsg;
			normalShipping = 25.00;
			discount = 1.00;
			actualShipping = getShippingPrice(postcode);
			break;
		default:
			msg = "Your suburb does not qualify for any shipping fee discount.\nWe however still offer a shipping discount of";
			actualShipping = getShippingPrice(postcode);
			break;
	}

	displayDiscount(msg, discount);
	displayShippingPrice(actualShipping, normalShipping);

	}

	public static void displayDiscount(String msg, double discount) {
		System.out.printf("%s %.2f%%.%n", msg, discount*100);
	}

	public static double getShippingPrice(int postcode) {
		
		double discount = 0.05;
		double normalShipping = 19.55;
		double actualShipping = 0;
		
		switch (postcode) {
		case 43650:
			getShippingPrice(postcode);
			normalShipping = 10.00;
			discount = 0.7500;
			actualShipping = normalShipping * (1-discount);
			break;
		case 43000:
			normalShipping = 15.00;
			discount = 0.8500;
			actualShipping = normalShipping * (1-discount);
			break;
		case 43400:
			normalShipping = 25.00;
			discount = 1.00;
			actualShipping = normalShipping * (1-discount);
			break;
		default:
			actualShipping = normalShipping * (1-discount);
			break;
	}
		return actualShipping;

	}

	public static void displayShippingPrice(double a, double b) {
		System.out.printf("Your final shipping fee is RM%.2f. %n(Normal shipping fee is RM%.2f).%n%n", a, b);
	}

	public static void getQuantity(int postcode) {
		
		Scanner input = new Scanner(System.in);
		
		final double TshirtPrice = 10.00;
		final double TrouserPrice = 20.00;
		
		int numOfShirts = 0;
		int numOfTrousers = 0;
		double finalPrice;
		
		
		
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
				finalPrice = calcTotal(numOfShirts, TshirtPrice, numOfTrousers, TrouserPrice, postcode);
				dispFinalPrice(finalPrice);
			}
			else
				System.out.println("At most 4... and of course, plz enter a positive number...");
		}
	}

	public static double calcProductPrice(int n, double u, int r, double i) {
		return n * u + r * i;
	}

	public static double calcTotal(int p, double o, int w, double e, int r) {
		return (calcProductPrice(p, o, w, e)) + getShippingPrice(r);
	}

	public static void dispFinalPrice(double x) {
		System.out.printf("RM%.2f. Please come again!!!", x);
	}

	}