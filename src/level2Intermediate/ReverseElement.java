package level2Intermediate;

import java.util.Scanner;

//Reverse the elements of a given array
public class ReverseElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("----------------Reverse Element Of Given Array --------------");
		
		for(int i=n-1;i>=0;i--) {
			
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}
}
