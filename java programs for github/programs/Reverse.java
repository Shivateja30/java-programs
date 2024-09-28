import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        int num;
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        int reverse=0;
        int remainder=0;
      
         while(temp>0){
            remainder=temp%10;
            reverse=reverse*10+remainder;
            temp=temp/10;
         }
         System.out.println(reverse);
    }
}