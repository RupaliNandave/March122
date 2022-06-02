package Array;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={ {10,20,30,40},{30,40,20,50}};
		System.out.println(arr.length);//row number
		
	for(int i=0;i<=arr.length-1;i++) {//row
		
		for( int j=0;j<=3;j++) {//column
	
		System.out.print(arr[i][j]+ " ");
	}
	System.out.println();
	}
}}