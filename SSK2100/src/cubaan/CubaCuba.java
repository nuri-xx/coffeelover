package cubaan;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CubaCuba {

 public static void main(String[] args) throws Exception {
    ////////////////////////////////////////////////////////////////////
   // READING IN THE DATA FROM A CSV (Comma separated value) FILE
   String strRecord = "";
   Scanner inputFile = new Scanner(new File("dataset.csv"));
   inputFile.useDelimiter("(\\n,]");

   List<String> records = new ArrayList<String>(); // THE ARRAYLIST STORING ALL YOUR RECORDS
   inputFile.nextLine(); // This code allows us to skip the header (ID, Name, etc.)

   // The WHILE loop below gets each row and adds it into records (which is an ArrayList...
   // An array list is just an array of strings that you don't need to know about
   // much. Anything U need to know about it will be described for you.
   while (inputFile.hasNext()) {
     // get the next line
     strRecord = inputFile.next();
     records.add(strRecord); // each row is added

   inputFile.close();

   System.out.println("Total elements in the records array list: " + records.size() + ".\n");

/////// SAMPLE CODE FOR ACCESSING DATA IN THE ARRAYLIST ///////////////////
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

///////// IN CASE ANYBODY WANTS TO SEE HOW WE CAN ALSO USE OFFSET AS THE CONTROL VAR.///
// for (offset = 0; offset <= 163; offset = offset + 7) {
//   // Read and display names and show state
//   name = records.get(offset+1);
//   state = records.get(offset+2);
//   age = records.get(offset+4);
//   System.out.println(name + " comes from " + state + " and is " + age + "-years old");
// }
   
   /////////////////////////////DETECTIVE TIME><////////////////////////////////
   //First Question
//   offset = 0;
//   String pension;
//   
//   System.out.println
   }
 }
}

