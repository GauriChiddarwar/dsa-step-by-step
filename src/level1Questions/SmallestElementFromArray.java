package level1Questions;
//Find the smallest element in a given array
import java.util.Scanner;

public class SmallestElementFromArray {
	
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
		
		int SmallestElement=arr[0];
		for(int i=0;i<n;i++) {
			
			 if(arr[i]<SmallestElement) {
				 SmallestElement=arr[i];
			 }
		}
		System.out.println(" Smallest Element is :- " + SmallestElement);

		
	}

}
