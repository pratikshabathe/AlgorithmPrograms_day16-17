package com.bridgelabz.algorithm_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(60, 35, 8, 20, 34, 90, 54, 41, 2));
	    System.out.println("before sort " + numbers);
	    boolean swapped = false;
	    do {
	      swapped = false;
	      for (int i = 0; i < numbers.size() - 1; i++) {
	        if (numbers.get(i) > numbers.get(i + 1)) {
	          int temp = numbers.get(i);
	          numbers.set(i, numbers.get(i + 1));
	          numbers.set(i + 1, temp);
	          swapped = true;
	        }
	      }
	    } while (swapped);

	    System.out.println("after sort " + numbers);
	  }

}
