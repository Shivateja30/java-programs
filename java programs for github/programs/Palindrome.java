import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        int num;
        System.out.println("Enter yoiur number to check weather it is palindrome or not");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        int reverse=0;
        int remainder=0;
        while(temp>0){
            remainder=temp%10;
            reverse=reverse*10+remainder;
            temp=temp/10;
        }
    
        if(reverse==num){
        System.out.println(num+" is a palindrome");
        }else{ 
        System.out.println(num+" is not a palindrome");
    }}
    
}
