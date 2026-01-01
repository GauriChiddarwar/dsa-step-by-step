package level3Advne;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter new number:- ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter element in array :-");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate Array:-"+Arrays.toString(arr));
		
		for(int i=0;i<n;i++) {
			
			for(int j= i+1;j<n;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array:-"+Arrays.toString(arr));
		
		int newSize=n;
		for(int i=0;i<newSize-1;i++) {
			
			for(int j=i+1;j<newSize;j++) {
				if(arr[i]==arr[j]) {
				for(int k=j;k<newSize-1;k++) {
					
					arr[k]=arr[k+1];
				}

				j--;
				newSize--;

				}
				
				
		 	}
		}
		
      System.out.println("Array  after removing duplicate element :-");
      for(int i=0;i<newSize;i++) {
    	   System.out.print(arr[i]);
      }
		
		
		sc.close();
	}
}
