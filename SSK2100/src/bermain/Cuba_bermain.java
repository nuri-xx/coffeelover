package bermain;

import javax.swing.*;  
public class Cuba_bermain {  

	public static void main(String[] args) {
		
		//int myArray;
		int[] myArray = new int[3];
		
		int num = 1;
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = num;
			num++;
		}
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for (int numbers : myArray) {
			System.out.println(numbers);
		}
			
	}
}