package week1.day2;

import java.util.Arrays;
public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(arr);
		for (int i = 1; i < arr.length; i++) {
			if(i!=arr[i]) {System.out.println(i);}
			break;
			
		}
	}

}
