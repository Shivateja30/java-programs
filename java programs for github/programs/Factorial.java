import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        int num;
        System.out.println("enter your number");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of your number is : "+factorial);        
    
}
}