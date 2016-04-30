import java.util.Scanner;

public class Session7Assignment2 {
	
	public static void main (String args[]){
		Scanner scnr = new Scanner (System.in);
		
		System.out.println ("Enter the number");
		try {
		int  integer = Integer.parseInt(scnr.next());
		System.out.println ("Entered String is "+ integer);
		}
		catch(NumberFormatException E){
			
			System.out.println ("Please enter integer");
			
		}
		finally{
		System.out.println ("Closing the program");
			scnr.close();
	}
	}
	
	
}