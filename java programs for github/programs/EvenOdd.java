import java.util.Scanner;
public class EvenOdd{
    public static void main (String[]args){
        int num1;
     System.out.println("enter your number");
     Scanner sc= new Scanner(System.in);
     num1=sc.nextInt();
     if(num1%2==0){
        System.out.println("your number is  an even number");
     }else{
        System.out.println("your number is an odd number");
     }

    }
}