package level2Intermediate;

import java.util.Scanner;

//Count how many times a specific element appears in a given array
public class Count {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter Specific element -");
		
		int specificElement=sc.nextInt();
		
		int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]==specificElement) {
		count++;}
		
	}
	System.out.println(count);
		
		
		
		sc.close();
	}
}
