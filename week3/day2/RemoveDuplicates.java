package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "PayPal India";
		char[] charArray = name.toLowerCase().toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();
		for (int i=0; i < charArray.length; i++)
		{
			boolean add = charSet.add(charArray[i]);
			if(add==false) {dupCharSet.add(charArray[i]);
			charSet.remove(charArray[i]);}
						
		}
		
		System.out.println(charSet);
		System.out.println(dupCharSet);
		
		List<Character> charList = new ArrayList<Character> (charSet);

		for(int i=0; i< charList.size(); i++)
		{ if(charList.get(i).equals(' '))
			charList.remove(i);
		}
		
		System.out.println(charList);
	}
	
	

}

/*
//Declare a String as "PayPal India"

//Convert it into a character array

//Declare a Set as charSet for Character

//Declare a Set as dupCharSet for duplicate Character

//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print it
*/