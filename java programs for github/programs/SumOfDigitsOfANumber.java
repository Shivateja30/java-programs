import java.util.Scanner;
public class SumOfDigitsOfANumber {
    public static void main(String[]args){
        int num;
    
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int sum=0;
      while(num>0){
        sum=sum+num%10;
        num=num/10;
      }
    System.out.println(sum);
    }

    
}
