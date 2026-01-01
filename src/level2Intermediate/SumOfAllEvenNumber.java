package level2Intermediate;

import java.util.Scanner;

//Find the sum of all even numbers in a given array
public class SumOfAllEvenNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		int EvenNumberSum=0;
	  for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			EvenNumberSum+=arr[i];}
		
	}
	System.out.println(EvenNumberSum);
		
		
		
		sc.close();
	}
}
