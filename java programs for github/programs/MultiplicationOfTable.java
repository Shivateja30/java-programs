import java.util.Scanner;
public class MultiplicationOfTable{
    public static void main(String[]args){
        int num;
        System.out.print("Which table you want:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
}