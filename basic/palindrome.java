
import java.util.Scanner;

public class palindrome{
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int r=reverse(num);
        if(r==num){
            System.out.println("The given num "+num+" is Palindrome");
        }
        else{
            System.out.println("The given num "+num+" is not Palindrome");
        }
    }
}