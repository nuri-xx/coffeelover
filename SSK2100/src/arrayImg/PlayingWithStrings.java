package arrayImg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayingWithStrings {
	public static void main(String[] args) {
		String filePath = "images.csv";
		String line = "";
		// we're using an ArrayList here, as it's easier to read into an array list
		// as it can expand as needed [we assume we don't know how many
		// rows of data there are in images.csv
		List<String> rows = new ArrayList<String>(); 
		// the try block is what it says... it tries the following code 
		// but every try block must have it's catch(es) - i.e. code that will run
		// in case the runtime error happens (e.g. file does not exist ka... wrong IO type ka
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while((line = br.readLine()) != null) {
				rows.add(line); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // is what we'd normally put in there :)
			System.out.println("The file does not exist lah!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 'convert' the arraylist into an array
		String[] images = rows.toArray(new String[] {});
		for (int i=0; i < images.length; i++) {
			System.out.println(images[i]);
		}
	
	}
}