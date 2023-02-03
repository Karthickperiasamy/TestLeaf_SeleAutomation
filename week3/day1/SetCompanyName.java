package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class SetCompanyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "Google";
		char[] charArray = companyName.toLowerCase().toCharArray();
		Set<Character> uniqueLetters = new HashSet<Character>();
		String output = "";
		
		for(int i=0; i<charArray.length; i++) 
		{boolean add = uniqueLetters.add(charArray[i]);
		if (add) {
		output = output + charArray[i];
		
		}

	}
		System.out.println(uniqueLetters);
		System.out.println(output);
	}
}
