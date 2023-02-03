package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberofOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> treeMap = new TreeMap<Integer,Integer>();
		for(int i=0; i<input.length; i++)
		{
			if(treeMap.containsKey(input[i])) {
				int existingCount = treeMap.get(input[i]);
				treeMap.put(input[i], existingCount+1);
			}
			else {
				treeMap.put(input[i], 1);
			}
		}

		System.out.println(treeMap);
	}

}


//Assignment2: FindNumbersOccurances
	/*
	 * Input array numbers, each occurances
	 * 
	 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
	 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
	 * 
	 * Order: Ascending Order
	 * 
	 */

	/*
	 * Psuedcode:
	 * 
	 * a) Create Map -> TreeMap
	 * b) For loop -> each number -> add to the map
	 * c) If it is exist -> update it with + 1
	 * 	  Else -> new entry with 1 as value
	 * 
	 */