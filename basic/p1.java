import java.util.*;

public class p1{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price of pen");
        float f=sc.nextFloat();
        System.out.println("enter the price of pencile");
        float a=sc.nextFloat();
        System.out.println("enter the price of eraser");
        float b=sc.nextFloat();
        float total=f+a+b;
        double bill=total+(total*0.18);
        System.out.println("total bill is "+bill);
    }
}
