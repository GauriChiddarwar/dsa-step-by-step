package level1Questions;
import java.util.Scanner;

/*Find the largest element in a given array
*/
public class LargestElementFormArray {
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
			
			int largestElement=arr[0];
			for(int i=0;i<n;i++) {
				
				 if(arr[i]>largestElement) {
					 largestElement=arr[i];
				 }
			}
			System.out.println("Largest Element is :- " +largestElement);
	}
}
