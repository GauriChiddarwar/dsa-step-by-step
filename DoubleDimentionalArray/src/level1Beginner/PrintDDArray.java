package level1Beginner;

import java.util.Scanner;

public class PrintDDArray {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of row");
		int rowSize=sc.nextInt();
		System.out.println("Enter the size of column");
		int columnSize=sc.nextInt();
		
		int arr[][]=new int[rowSize][columnSize];
		
		System.out.println("Enter the element in array:-");
		for(int i =0; i<rowSize;i++) {
			for(int j=0;j<columnSize;j++) {
            arr[i][j]=sc.nextInt();
		}
		
			
			
		
	}
		System.out.println("Element in Double array is :-");
		for(int i =0; i<rowSize;i++) {
			for(int j=0;j<columnSize;j++) {
                   System.out.print(arr[i][j]+" ");            
		}
			System.out.println(" ");
		}
		sc.close();

}
}
