package Array;

public class Example2 {

	public static void main(String[] args) {
	
		//int arr[] =new int[4];
		//declaration& initialization
		
		int arr[]= {10,20,30,40,50,60};
		

		System.out.println(arr[1]);//20
		System.out.println("Array size: "+arr.length);//6
		
		//arr[6]=100;//Arrayindexoutofboundsexception
		System.out.println("--print array info in original order");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
System.out.println("--print array info in reverse order");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
