package assignment;

import java.util.Scanner;

public class Banking_problem {

	public static void main(String[] args) {
		double initial_deposit;
		int num_of_banks;
		double total_lent = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Key in the initial deposti into Bank-1: RM");
		initial_deposit = input.nextDouble();
		System.out.print("Key in the number of banks to simulate: ");
		num_of_banks = input.nextInt();
		System.out.println("Simulating the initial deposit of RM" + initial_deposit + " for " + num_of_banks +"-banks...");
		System.out.println("");
		
		int[] banks = new int[num_of_banks];
		double[] can_lend = new double[num_of_banks];
		double[] new_amount = new double[num_of_banks];
		
		
		new_amount[0] = initial_deposit;
		//can_lend[0] = 0.9 * initial_deposit;
		
		for (int i=0; i < banks.length - 1; i++) {
			can_lend[i] = 0.9 * new_amount[i];
			
			System.out.printf("Money deposited into Bank-%d = RM%.2f. Can lend = RM%.2f.\n", i+1, new_amount[i], can_lend[i]);
			new_amount[i+1] = can_lend[i];
		}
		new_amount[num_of_banks-1] = can_lend[num_of_banks-2];
		
		for (int i = 0; i < can_lend.length; i++) {
			total_lent = total_lent + can_lend[i];
		}
		
		can_lend[num_of_banks-2] = 0;
		
		System.out.printf("Money deposited into Bank-%d = RM%.2f. Can lend = RM%.2f.\n", num_of_banks, new_amount[num_of_banks-1], can_lend[num_of_banks-2]);
		System.out.printf("Total amount lent = RM%.2f", total_lent);
	}

}
