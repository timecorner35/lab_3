package lab_3;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
	    String word = scan.nextLine();
	    int counter = 0;
	    String w ="hi";
	    
	    while(word.contains(w)) {
	    	word=word.substring(word.indexOf(w)+2);
	    			counter++;
	    }
	    
	    System.out.println(counter);
	    
	    
	  }
	}