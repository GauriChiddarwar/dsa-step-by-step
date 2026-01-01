package level2Intermediate;

import java.util.Scanner;

//Check if a given array contains a specific element (Search element)
public class SearchElement {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter element in an array:-");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter yur Search ELement");
		
		int searchElement=sc.nextInt();
		
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==searchElement) {
				flag=true;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		
		sc.close();

		
	}
}
