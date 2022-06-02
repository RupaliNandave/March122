package Array;

import java.util.Arrays;

public class comparetwoarray {

	public static void main(String[] args) {
		//Defining arrays to compare
		String[]array1=new String[] {"mango","grapes","plum"};
		String[]array2=new String[] {"mango","grapes","plum"};
		
		//comparing two arrays using equals()method
		
		if(Arrays.equals(array1, array2)) {
		System.out.println("Arrays are equal");
	}
		else
		{
			System.out.println("Arrays are  not equal");
		}}}

