package level2Intermediate;
//Find the index of a specific element in a given array

import java.util.Scanner;

public class FindSpecificElementIndex {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter element for their index:-");
		
		int searchElement=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(arr[i]==searchElement) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}


}
