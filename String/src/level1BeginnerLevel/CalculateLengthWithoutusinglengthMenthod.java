package level1BeginnerLevel;

import java.util.Scanner;

public class CalculateLengthWithoutusinglengthMenthod {
        public static void main(String[] args) {
			
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter string:- ");
        	String s1=sc.nextLine();
        	
        	char ch[]=s1.toCharArray();
        	int count =0;
        	for(int i=ch.length-1;i>=0;i--) {
        		
            count++;
        	}
        	System.out.println("The length of the string is  :-"+count);
        	sc.close();
		}
}
