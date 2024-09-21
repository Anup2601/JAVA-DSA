import java.util.*;
class bin_dec{
    public static void conversion(int num){
        int i=0,s=0;
        while(num>0){
            int rem=num%10;
            s=s+((int)Math.pow(2,i)*rem);
            num=num/10;
            i++;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num=sc.nextByte();
        conversion(num);

    }
}