package level1Questions;

import java.util.Scanner;

//Calculate the sum of all elements in a given array
public class SumOfTheElementInGivenArray {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum:="+sum);
	}
}
