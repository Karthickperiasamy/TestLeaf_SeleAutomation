package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] companies = {"Google", "Microsoft","TestLeaf","Maverick"};
		Set<String> companiesSet = new TreeSet<String>();
		for(int i=0; i< companies.length; i++)
		{
			companiesSet.add(companies[i]);
			
		}
		
		System.out.println(companiesSet);

		List<String> companiesList = new ArrayList<String>(companiesSet);
		
		
		Collections.reverse(companiesList);
		System.out.println(companiesList);
	}
	
	
	

}


/*

	// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems
	

*/