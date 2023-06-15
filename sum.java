import java.util.*;

class sum{
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        a=s.nextInt();
        System.out.println("enter second number");
        b=s.nextInt();
        
        System.out.println("sum of  " + a + " and " + b +" is:");
        System.out.println(a+b);
    }
}