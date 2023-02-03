package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] unique = {9,2,3,4,5,6,7,7,5,2,3,9,1};
		Set<Integer> uniqueSet = new TreeSet<Integer>();
		for (int i = 0; i < unique.length; i++)
		{
			uniqueSet.add(unique[i]);
		}
     System.out.println(uniqueSet);
     List<Integer> uniqueList = new ArrayList<Integer>(uniqueSet); 
     System.out.println(uniqueList);
     for(int i= 0; i < uniqueList.size();i++)
     {
    	 if((uniqueList.get(i))!=i+1) {
    		 i++;
    		 System.out.println("Missing number is" + i);
    		 break;
    	 }
    		 
    	 
     }
	}

	
}


/*package collectionsprogram;

public class MissingNumber{
/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */