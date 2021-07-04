package completeProgramQuestion;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

		int count;
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many salespersons' bonus to calculate? ");
		System.out.println();
		count = input.nextInt();
		
		String name[] = new String[count];
		double salesA[] = new double[count];
		double salesB[] = new double[count];
		double salesC[] = new double[count];
		
		double bonusA[] = new double[count];
		double bonusB[] = new double[count];
		double bonusC[] = new double[count];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("Enter name of salesperson(" + (i+1) + "): ");
			name[i] = input.next();
			
			System.out.print("Product-A sales: RM");
			salesA[i] = input.nextDouble();
			System.out.print("Product-B sales: RM");
			salesB[i] = input.nextDouble();
			System.out.print("Product-C sales: RM");
			salesC[i] = input.nextDouble();
			System.out.println();
		}
		
		for (int i = 0; i < name.length; i++) {
			if(salesA[i] <= (1 * 5000) && salesA[i] >= (0.8 * 5000)) {
				bonusA[i] = 0.25;
			} else if (salesA[i] <= (0.79 * 5000) && salesA[i] >= (0.5 * 5000)) {
				bonusA[i] = 0.15;
			} else if (salesA[i] <= (0.49 * 5000) && salesA[i] >= (0.2 * 5000)) {
				bonusA[i] = 0.05;
			} else if (salesA[i] <= (0.19 * 5000) && salesA[i] >= (0.01 * 5000)) {
				bonusA[i] = 0;
			}
			
			if(salesB[i] <= (1 * 1000) && salesB[i] >= (0.8 * 1000)) {
				bonusB[i] = 0.25;
			} else if (salesB[i] <= (0.79 * 1000) && salesB[i] >= (0.5 * 1000)) {
				bonusB[i] = 0.15;
			} else if (salesB[i] <= (0.49 * 1000) && salesB[i] >= (0.2 * 1000)) {
				bonusB[i] = 0.05;
			} else if (salesB[i] <= (0.19 * 1000) && salesB[i] >= (0.01 * 1000)) {
				bonusB[i] = 0;
			}
			
			if(salesC[i] <= (1 * 2500) && salesC[i] >= (0.8 * 2500)) {
				bonusC[i] = 0.25;
			} else if (salesC[i] <= (0.79 * 2500) && salesC[i] >= (0.5 * 2500)) {
				bonusC[i] = 0.15;
			} else if (salesC[i] <= (0.49 * 2500) && salesC[i] >= (0.2 * 2500)) {
				bonusC[i] = 0.05;
			} else if (salesC[i] <= (0.19 * 2500) && salesC[i] >= (0.01 * 2500)) {
				bonusC[i] = 0;
			}
		}
			
			for (int j = 0; j < name.length; j++) {
				System.out.println("Bonus for " + name[j] + ":");
				System.out.println("P-A: (" + (bonusA[j] * 100) + "%) RM" + (bonusA[j] * salesA[j]));
				System.out.println("P-B: (" + (bonusB[j] * 100) + "%) RM" + (bonusB[j] * salesB[j]));
				System.out.println("P-C: (" + (bonusC[j] * 100) + "%) RM" + (bonusC[j] * salesC[j]));
				System.out.println("======================");
				System.out.println("TOTAL BONUS: RM" + ((bonusA[j] * salesA[j]) + (bonusB[j] * salesB[j]) + (bonusC[j] * salesC[j])));
				System.out.println("======================");
				System.out.println();
			}
			
		}

}
