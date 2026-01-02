package level1BeginnerLevel;

import java.util.Scanner;

public class ReverseStringwithoutusinganymethod {
  
        public static void main(String[] args) {
			
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter string:- ");
        	String s1=sc.nextLine();
        	String reverse=" ";
        	
        	char ch[]=s1.toCharArray();
        	
        	for(int i=ch.length-1;i>=0;i--) {
        		
        		reverse+=ch[i];
        	}
        	System.out.println("this is a reverse string :-"+reverse);
        	
        	sc.close();
		}
}
