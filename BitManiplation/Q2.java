import java.util.*;
class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swap:-a= "+ a+",b= " +b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap:-a= "+ a+",b= " +b);
    }
}