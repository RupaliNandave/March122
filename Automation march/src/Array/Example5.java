package Array;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
	
		int arr[]= {85,20,45,10,30,48,96,152,147,56,123,458,10,50,2,0};
		System.out.println(arr.length);//row number //16
		
		System.out.println("--- original info");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			
		}
			System.out.println("--- ascending order");
			Arrays.sort(arr);// Ascending order
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println(arr[i]);
			
			
		}
			System.out.println("--- descending order");
		
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			
			}
	}}


