import java.util.Scanner;
public class Mathoperations{
    public static void main(String[]args){
        double num1,num2;
        System.out.println("enter your first number:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextDouble();
        System.out.println("enter your second number");
        num2=sc.nextDouble();
        System.out.println("sum of two digits: "+(num1+num2));
        System.out.println("difference of two digits: "+(num1-num2));
        System.out.println("product of two digits: "+(num1*num2));
        System.out.println("division of two digits: "+(num1/num2));
    }

}