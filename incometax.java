import java.util.*;
public class incometax {
    public static void main(String args[]){
        float income;
        float tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to income tax calculator");
        System.out.print("Please enter the income : ");
        income = sc.nextFloat();
        if(income<500000) //incomme in lakh
        {
            tax = 0;
        }
        else if (income>=500000 && income<1000000)
        {
            tax = income * 0.2f;
        }
        else 
        {
            tax = income * 0.3f;
        }
        System.out.println("Tax to pay is : "+ tax);

    }
    
}
