package level1Questions;

import java.util.Scanner;
import java.util.Arrays;

//Print all elements of a given array in a single line
public class PrintArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		System.out.println("--------------Method 1:- By using for loop-----------");
		
		System.out.println("Element of the given array is :-");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("--------------Method 2:- By using toString Method-----------");
		
		System.out.println("Element of the given array is :-"+Arrays.toString(arr));

		sc.close();
	}

}
