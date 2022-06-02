package Array;

import java.util.Arrays;

public class compareintarray {

	public static void main(String[] args) {
		int array1[] =new int [] {1,2,3,4,5};
		int array2[] =new int [] {1,2,3,4,5,6};
		
		//comparing int array
		if(Arrays.equals(array1, array2)) {
			System.out.println("Arrays are equal");
			
		}
		else {
			System.out.println("Arrays are not equal");
		}


	}

}
