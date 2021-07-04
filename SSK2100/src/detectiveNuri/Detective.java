package detectiveNuri;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Detective {
	
	public static void main(String[] args) throws Exception {
		// READING IN THE DATA FROM A CSV (Comma Seperated Value) FILE
		String strRecord = "";
		Scanner inputFile = new Scanner(new File("dataset.csv"));
		inputFile.useDelimiter("[\\n,]");
		
		List<String> records = new ArrayList<String>(); // THE ARRAYLIST STORING ALL YOUR RECORDS
		inputFile.nextLine(); // This code allows us to skip the header (ID, Name, etc.)
		
		// The WHILE loop below gets each row and adds it into records (which is an ArrayList...
		// An array list is just an array of strings that you don't need to know about
		// much. Anything you need to know about it wilpl be described for you.
		while (inputFile.hasNext()) {
			// get the next line
			strRecord = inputFile.next();
			records.add(strRecord); //each row is added
		}
		inputFile.close();
		
		System.out.println("Total elements in the records array list: " + records.size() + ".\n");
		
		// SAMPLE CODE FOR ACCESSING DATA IN THE ARRAYLIST
		int offset = 0;
		String name, state, age;
		for (int i=1; i <= 24; i++) {
			// Read and display names and show state
			name = records.get(offset+1);
			state = records.get(offset+2);
			age = records.get(offset+3);
			offset = offset + 7;
			System.out.println(name + " comes from " + state + " and is " + age + "-years old");
		}
		
		System.out.println("");
		System.out.println("");
		
		//DETECTIVE GAME STARTED :D//
		
		//QUESTION 1 QUESTION 1 QUESTION 1 QUESTION 1//
		System.out.println("Pensioners (aged 56 and above) that are not getting paid pensions: ");
		
		offset = 0;
		
		for (int i=1; i <= 24; i++) {
			// Read and display names and show state
			String pensions;
			double newPensions;
			double newAge;
			
			pensions = records.get(offset+6);
			name = records.get(offset+1);
			age = records.get(offset+3);
			offset = offset + 7;
			
			newPensions = Double.parseDouble(pensions);
			newAge = Double.parseDouble(age);
			
			if (newAge>=56 && newPensions==0) 
			System.out.println(name);			
		}
		
		//QUESTION 2 QUESTION 2 QUESTION 2 QUESTION 2//
		
		System.out.println("\n\nPensioners (aged 56 and above) that are getting paid pensions: ");
		
		offset = 0;
		
		for (int i=1; i <= 24; i++) {
			// Read and display names and show state
			String pensions;
			double newPensions;
			double newAge;
			
			pensions = records.get(offset+6);
			name = records.get(offset+1);
			age = records.get(offset+3);
			offset = offset + 7;
			
			newPensions = Double.parseDouble(pensions);
			newAge = Double.parseDouble(age);
			
			if (newAge>=56 && newPensions!=0) 
			System.out.println(name);		
		}
		
		//QUESTION 3 QUESTION 3 QUESTION 3 QUESTION 3//
	
		System.out.println("\n\nTotal people from Selangor that have their main income exceeding RM4,500: ");
		
		offset = 0;
		int counter = 0;
		
		for (int i=1; i <= 24; i++) {
			// Read and display names and show state
			String mainIncome;
			double newMainIncome;
			
			mainIncome = records.get(offset+4);
			state = records.get(offset+2);
			offset = offset + 7;
			
			newMainIncome = Double.parseDouble(mainIncome);
			
			if (state.equals("Selangor") && newMainIncome>4500) 
				counter += 1;
		}
			
		System.out.println(counter);
				
		//QUESTION 4 QUESTION 4 QUESTION 4 QUESTION 4//
		
		System.out.println("\n\nHighest Main Income Award: ");
		
		offset = 0;
		double highestMainIncome = 0;
		String winner = "";
		String winnerState = "";
		
		for (int i=1; i <= 24; i++) {
			// Read and display names and show state
			String mainIncome;
			double newMainIncome;
			
			mainIncome = records.get(offset+4);
			name = records.get(offset+1);
			state = records.get(offset+2);
			offset = offset + 7;
			
			newMainIncome = Double.parseDouble(mainIncome);
			
			if (highestMainIncome<newMainIncome) {
				highestMainIncome = newMainIncome;
				winner = name;
				winnerState = state;
			}
		}
		System.out.println(winner + " comes from " + winnerState);
		
		//QUESTION 5 QUESTION 5 QUESTION 5 QUESTION 5//
		System.out.println("\n\nLowest Overall Income: ");
		
		offset = 0;
		double lowestOverallIncome = 1000000;
		
		for (int i=1; i <= 24; i++) {
			// Read and display names and show state
			String mainIncome, sideIncome, pensions;
			double newMainIncome, newSideIncome, newPensions, overallIncome;
			
			mainIncome = records.get(offset+4);
			sideIncome = records.get(offset+5);
			pensions = records.get(offset+6);
			name = records.get(offset+1);
			state = records.get(offset+2);
			offset = offset + 7;
			
			newMainIncome = Double.parseDouble(mainIncome);
			newSideIncome = Double.parseDouble(sideIncome);
			newPensions = Double.parseDouble(pensions);
			
			overallIncome = newMainIncome + newSideIncome + newPensions;
			
			if (lowestOverallIncome>overallIncome) {
				lowestOverallIncome = overallIncome;
				winner = name;
				winnerState = state;
			}
			
		}
		System.out.println(winner + " comes from " + winnerState);
		
	} 

}
