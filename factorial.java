import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter no to find factorial");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){       //for(int i=0;i<=num-1;i++)
            fact *= i;                //fact *=(num-i);
        }
        System.out.println("factorial of " +num +" is : " +fact);
    }
    
}
