package dataNormalization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) throws FileNotFoundException {
		String StrRecord = "";
		Scanner inputFile = new Scanner(new File("lgdata.csv"));
		inputFile.useDelimiter("[\\n,]");
		
		List<String> records = new ArrayList<String>();
		
		while(inputFile.hasNext()) {
			StrRecord = inputFile.next();
			records.add(StrRecord);
		}
		inputFile.close();
		
		String l1, l2, l3, l4, l5;
		double minLine1 =99999, maxLine1 = 0;
		
		//COLUMN 1
		int offset = 0;
		for (int i=0; i<100; i++) {
			l1 =records.get(offset);
			offset = offset+5;
			double doublel1 = Double.parseDouble(l1); 
				if(doublel1 > maxLine1)
				maxLine1 = doublel1;
				if(doublel1 < minLine1)
				minLine1 = doublel1;
			
		}
		
		
		//COLUMN 2
		double minLine2 = 99999, maxLine2 = 0;
		offset = 0;
		for (int i=0; i<100; i++) {
			l2 =records.get(offset +1);
			offset = offset+5;
			double doublel2 = Double.parseDouble(l2); 
				if(doublel2 > maxLine2)
				maxLine2 = doublel2;
				if(doublel2 < minLine2)
				minLine2 = doublel2;	
		}
			
			
		//COLUMN 3
		double minLine3 = 99999, maxLine3 = 0;
		offset = 0;
		for (int i=0; i<100; i++) {
			l3 =records.get(offset +2);
			offset = offset+5;
			double doublel3 = Double.parseDouble(l3); 
				if(doublel3 > maxLine3)
				maxLine3 = doublel3;
				if(doublel3 < minLine3)
				minLine3 = doublel3;	
		}
			
					
		//COLUMN 4
		double minLine4 = 99999, maxLine4 = 0;
		offset = 0;
		for (int i=0; i<100; i++) {
			l4 =records.get(offset +3);
			offset = offset+5;
			double doublel4 = Double.parseDouble(l4); 
				if(doublel4 > maxLine4)
				maxLine4 = doublel4;
				if(doublel4 < minLine4)
				minLine4 = doublel4;	
		}
		
		
		//COLUMN 5
		double minLine5 = 99999, maxLine5 = 0;
		offset = 0;
		for (int i=0; i<100; i++) {
			l5 =records.get(offset +4);
			offset = offset+5;
			double doublel5 = Double.parseDouble(l5); 
				if(doublel5 > maxLine5)
				maxLine5 = doublel5;
				if(doublel5 < minLine5)
				minLine5 = doublel5;	
		}
		
		
		offset = 0;
		for (int i=0; i<500; i++) {
			String existingColData = records.get(offset);
			double doubleExistingColData = Double.parseDouble(existingColData);
			int mod = offset%5;
			double normColData = -1;
			
			switch(mod) {
			case 0 : 
				normColData = (doubleExistingColData - minLine1) / (maxLine1 - minLine1);
				break;
				
			case 1 : 
				normColData = (doubleExistingColData - minLine2) / (maxLine2 - minLine2);
				break;
			case 2 : 
				normColData = (doubleExistingColData - minLine3) / (maxLine3 - minLine3);
				break;
				
			case 3 : 
				normColData = (doubleExistingColData - minLine4) / (maxLine4 - minLine4);
				break;
				
			case 4 : 
				normColData = (doubleExistingColData - minLine5) / (maxLine5 - minLine5);
				break;
			}
			System.out.printf("%.4f, ",normColData);
	
			if(mod == 4) {
				System.out.println();
			}

			offset++;
	
		}	
	}

}
