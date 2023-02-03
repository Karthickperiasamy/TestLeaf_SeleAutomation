package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxValue = 0;
		  int maxChar = ' ';		
		String input = "abbaba";
		Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		char[] charArray = input.toLowerCase().toCharArray();
		for (int i = 0; i< charArray.length; i++)
		{
			if(hashMap.containsKey(charArray[i]))
			{
				Integer integer = hashMap.get(charArray[i]);
				integer= integer+1;
				hashMap.put(charArray[i], integer);
				
			}
				
		else
			hashMap.put(charArray[i],1);
		
			
			  
			  
		}
		System.out.println(hashMap);

		
	
	
	}}
		



/*
* input: abbaba
* output: b
* 
* 
*/

/*
 * Psuedocode
 * 
 * a) Map -> HashMap 
 * b) String -> ch[] -> Get all the character -> occurance
 * c) Keep comparing the occurance with other values -> max value -> character
 * 
 */