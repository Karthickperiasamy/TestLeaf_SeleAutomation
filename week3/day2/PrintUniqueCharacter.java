package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name = "Karthick";
		char[] charArray = Name.toLowerCase().toCharArray();
		Set<Character> uniqueChar = new HashSet<Character>();
		for(int i = 0; i< charArray.length; i++)
		{
			uniqueChar.add(charArray[i]);
		}
		
		System.out.println(uniqueChar);
		

	}

}

//PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */