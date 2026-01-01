package level1Questions;

import java.util.Arrays;

//Copy the elements of one array into another
import java.util.Scanner;

public class CopyElements {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		int copyArr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			copyArr[i]=arr[i];
			
		}
		System.out.println("It a elemnts from copyArr:-"+Arrays.toString(copyArr));
		sc.close();
}
}
