import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        boolean isprime = true;
        if(n==2){
            System.out.println("no is prime");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){     //for optimization sqr_root(n) is taken
            if(n%i==0){        //checking n is multiple of i,(i not equal to 0 and 1)
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println("no is prime");
        }        
        else 
        System.out.println("no. is not prime");
        }
    }   
}
