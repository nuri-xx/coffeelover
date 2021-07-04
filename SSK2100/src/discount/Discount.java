package discount;

import java.util.Scanner; //import the Scanner class

public class Discount {

	public static void main(String[] args) {
		int discounts = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter price of each item: ");
		Double price = scanner.nextDouble();
		
		System.out.print("Enter number of items bought: ");
		int units = scanner.nextInt();
		
		if (price>=0.01 && price<=10) {
			if (units>=1 && units <=9) {
				discounts = 0;
			}
			else if (units>=10 && units <=99) {
				discounts = 5;
			}
			else if (units>=100 && units <=499) {
				discounts = 9;
			}
			else if (units>=500 && units <=999) {
				discounts = 14;
			}
			else if (units>=1000) {
				discounts = 21;
			}
		}
		
		else if (price>=10.01 && price<=100) {
			if (units>=1 && units <=9) {
				discounts = 2;
			}
			else if (units>=10 && units <=99) {
				discounts = 7;
			}
			else if (units>=100 && units <=499) {
				discounts = 15;
			}
			else if (units>=500 && units <=999) {
				discounts = 23;
			}
			else if (units>=1000) {
				discounts = 32;
			}
		}
		
		else if (price>=100.01) {
			if (units>=1 && units <=9) {
				discounts = 5;
			}
			else if (units>=10 && units <=99) {
				discounts = 9;
			}
			else if (units>=100 && units <=499) {
				discounts = 21;
			}
			else if (units>=500 && units <=999) {
				discounts = 32;
			}
			else if (units>=1000) {
				discounts = 43;
			}
		}		
		
		double norm_price = price*units;
		double disc_price = 100-discounts;
		
		System.out.println("-------------------------------------");
		System.out.println("Thanks for buying with us");
		System.out.println("-------------------------------------");
		System.out.println("Enjoy your " + discounts + "% on the items that you've bought ^^");
		System.out.printf("Normal Price: RM%.2f\n", norm_price);
		System.out.printf("Need to pay: RM%.2f", norm_price*(discounts/100));

	}

}
