package level1Questions;

import java.util.Scanner;

//Calculate the average of all elements in a given array
public class AverageOfElement {
	
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
			
			sum+=arr[i];
			
		}
		int average=sum/n;
		System.out.println("the average of all elements in a given array:-"+average);

		
	}

}
