
import java.util.Scanner;

class sumDigit{
    public static int sum(int num){
        int s=0;
        while(num>0){
            int rem=num%10;
            s=s+rem;
            num=num/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int a=sum(num);
        System.out.println("Sum of the digit is "+a);
    }
}