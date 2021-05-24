package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
	
	public static void main(String[] arg) {
		
		
		
		//initiate arrays for numbers range and fizz buzz dictionary
		ArrayList<Integer> numbersRange = new ArrayList<Integer>();
		ArrayList<Fizz> quotingDict = new ArrayList<Fizz>();
		
		//populate arrays for numbers range and fizz buzz dictionary
		for(int i = rangeStart; i < rangeEnd; i++){
		    numbersRange.add(i);
		}
		for (int i = 0; i < names.length; i++) {
			quotingDict.add(new Fizz(Integer.parseInt(names[i][0]), names[i][1]));
		}
		
		
		
		
		//run fizz buzz methods
		fizzBuzz(numbersRange, quotingDict);
		//searchFizzBuzz(quotingDict);
	}
	
	
	
	
	//fizz buzz algorithm
	public static void fizzBuzz (ArrayList<Integer> numbersRange, ArrayList<Fizz> dict) {
		 			String output = "";
				    for (int numR : numbersRange) {
				        for (Fizz fizz : dict) {
				            if (numR % fizz.getNumber() == 0) {		
			                output += fizz.getName();	                
				            }
				        }
				        System.out.println(numR + " " + output);
				        output = "";       
				    }
	}
	
	
	
	//fizz buzz search algorithm
	public static void searchFizzBuzz (ArrayList<Fizz> dict) {
		while(true) {
			//scanner
			Scanner scanner = new Scanner(System.in); 
		    System.out.println("Input a number:");
		    String numberStr =scanner.nextLine(); 
		    int number = 0;
		    
		    //enforce numeric input
		    try {
		    	number = Integer.parseInt(numberStr); 
		    }
		    catch (Exception e) {
		    	System.out.println("--Warning-- Numbers only!");
		    }
		    
		    //run search method
		    String output = "";
		        for (Fizz fizz : dict) {
		            if (number % fizz.getNumber() == 0) {		
	                output += fizz.getName();	                
		            }
		        }
		        System.out.println(number + " - " + output);
		        output = "";       
		   
		}
		
		
		
	}
	
	
	
	




	   


	

	
}
