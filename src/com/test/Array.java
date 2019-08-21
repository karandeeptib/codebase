package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		/**
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 
		 * 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		 * 26 27 28 29 30 31 32 33 34 35 36 37 38 39
		 */

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println(" ");
		}

		/**
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name, age, team name, DOB, gender, Strike Rate --Try to
		 * create multiple Object Arrays for different players --Try to print all the
		 * values of each player on the console
		 */

		Object cric[] = new Object[6];
		cric[0] = "Karan";
		cric[1] = 31;
		cric[2] = "Ind";
		cric[3] = "25-02-1988";
		cric[4] = 'M';
		cric[5] = 70;

		System.out.println(" ************************************* ");

		for (int i = 0; i < cric.length; i++) {
			System.out.println(cric[i]);
		}
		
		
		

		/**
		 * Question 3: Try to print the following pattern on the console: 
		 * n = 4 
		 * n = 3 
		 * n = 2 
		 * n = 1 
		 * n = 0
		 */

		System.out.println(" ************************************* ");
		
		for (int i=4; i>=0;i--) {
			System.out.println("n = " +i);			
		}
		
		
		
		/**
		 * ArrayList
		 */
		
		
		
		
		/**
		 * Write a Java program to create a new array list, add some colors (string) and print out the collection
		 */
		
	 
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Pink");
		
		System.out.println(" ************************************* ");
		
		for (int i=0; i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
		
		
		
		
		
		
		/**
		 * Write a Java program to insert an element into the array list at the first and last positions
		 */
		System.out.println(" ************************************* ");
		
		ArrayList arr=new ArrayList();
		arr.add("first element");
		arr.add("Second element");
		arr.add("Third element");
		
		for (int i=0;i<arr.size();i++)
		System.out.println(arr.get(i));
		
		
		arr.add(0, "Replacing first element");
		
		arr.add(arr.size(), "Replacing last element");
		
		
		for (int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
		System.out.println(arr.size());
		
	
		/**
		 * Write a Java program to retrieve an element (at a specified index) from a given array list.
		 */
		System.out.println(" ************************************* ");
		
		ArrayList ar=new ArrayList<>();
		ar.add("first element");
		ar.add("Second element");
		ar.add("Third element");
		
		System.out.println(ar.get(1)); //fetchng the element at first position
		
		System.out.println(" ************************************* ");
		
		/**
		 * Write a Java program to update specific array element by given element.
		 */
				
		
		String givenelemt="Hello";
		
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("first element");
		ar1.add("Second element");
		ar1.add("Third element");
		
		System.out.println(ar.get(1));
		
		ar1.set(0, "updated element with new string");
		System.out.println(ar.get(1));
		
		System.out.println(ar1);
		
		
		/**
		 * Write a Java program to remove the third element from a array list. 
		 */
		
		System.out.println(" ************************************* ");
		
		ArrayList ar2=new ArrayList();
		
		
		ar2.add("Zero element");
		ar2.add("First element");
		ar2.add("Second element");
		ar2.add("Third element");
		ar2.add("Fourth element");
		
		
		System.out.println(ar2);
		
		ar2.remove(3);
		
		System.out.println(ar2);
		
		
		
		/**
		 * Write a Java program to search an element in a array list. 
		 */
		
		System.out.println(" ************************************* ");
		
		
		String search="Third element";
		
		ArrayList ar3=new ArrayList();
		
		ar3.add("Zero element");
		ar3.add("First element");
		ar3.add("Second element");
		ar3.add("Third element");
		ar3.add("Fourth element");
		
		for (int i=0;i<ar3.size();i++) {
			
			 if(ar3.get(i).equals(search))
				 System.out.println("Element found at location = " +i +" and its value is = " + search);			
			
		}
		
		
		
		
		/**
		 * Write a Java program to reverse elements in a array list
		 */
		
		System.out.println(" ************************************* ");
		
		
		
		ArrayList ar4=new ArrayList();
		
		
		ar4.add("Zero element");
		ar4.add("First element");
		ar4.add("Second element");
		ar4.add("Third element");
		ar4.add("Fourth element");
		
		
		
		for (int i=ar4.size()-1;i>=0;i--) {
			System.out.println(ar4.get(i));
		}
		
		
		
		/**
		 * Write a Java program of swap two elements in an array list.
		 */
		
		System.out.println(" ************************************* ");
		
		System.out.println(ar4);
		
		Collections.swap(ar4, 0, 3);
		
		System.out.println(ar4);
		
		
		
		
		/**
		 * Write a Java program to empty an array list.
		 */
		
		System.out.println(" ************************************* ");
		
		ar4.removeAll(ar4);
		
		System.out.println(ar4);
		
		
		
		/**
		 * Write a Java program to empty an array list.
		 */
		
		
		System.out.println(" ************************************* ");	
		
		ar3.trimToSize();
		
		System.out.println(ar3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
