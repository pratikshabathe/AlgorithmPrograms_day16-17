package com.bridgelabz.algorithm_problem;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void check() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two string");
	    String str1 = "";
	    str1 = scanner.next();
	    
	    String str2 = "";
	    str1 = scanner.next();
	    
	    //converting string to char array
	    char [] ch1 = str1.toCharArray();
	    char [] ch2 = str2.toCharArray();
	  
	    //sort character array
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    
	    //converting char array back to string
	    str1 = new String(ch1);
	    str2 = new String(ch2);
	    
	    //compare Strings
	    if(str1 == (str2)) 
	    	System.out.println("Anagram");
	    else
	    	System.out.println("not Anagram");
	}

	  public static void main(String[] args) {
		
		  Anagram anagram = new Anagram();
		  anagram.check();
	}
}
