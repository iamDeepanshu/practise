// keep entering no. until user press multipl of 10

import java.util.*;
class break1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
		int n,i;
        System.out.println("hello test");
         do{
            System.out.println("please enter any no.");
	        n=sc.nextInt();  
            if(n%10==0)
                {
                    break;
                }
		    System.out.println("your no. is : "+ n);
	       }while(true);
	    } 
	    
	}
//que --> do it by using for loop
//without break
/* 
        do{
            System.out.println("please enter any no.");
	        n=sc.nextInt();  
		    System.out.println("your no. is : "+ n);
	       }while(n%10!=0);	     
*/