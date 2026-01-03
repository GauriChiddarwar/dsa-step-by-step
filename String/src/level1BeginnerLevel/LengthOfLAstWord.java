package level1BeginnerLevel;

import java.util.Scanner;

public class LengthOfLAstWord {
          public static void main(String[] args) {
			
        	  Scanner sc= new Scanner (System.in);
        	  System.out.println("Enter Sentence :-");
        	  String s1= sc.nextLine();
        	  int count =0;
        	  for(int i=s1.length()-1;i>=0;i--) {

        		  if(s1.charAt(i)==' ') {
        			  
        			  break;
        		  }
        		  
        		  count++;
        	  }
        	  System.out.println("Length of last word is :-"+count);
        	  
        	  sc.close();
		}
}
