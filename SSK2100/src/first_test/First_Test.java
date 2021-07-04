package first_test;

import java.util.Scanner;
public class First_Test {

	public static void main(String[] args) {
		
		double percentage;
		String status;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Full Score of this test: ");
		double full_score = scanner.nextInt();
		System.out.println("Enter the student's score of this test: ");
		double score = scanner.nextDouble();
		
		percentage = (score/full_score) * 100;
		
		}
	}
