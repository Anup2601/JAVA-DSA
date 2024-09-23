import java.util.*;
class bin_dec{
    // Method to convert binary to decimal
    public static void conversion(int num){
        int i=0,dec=0;
        while(num>0){
            int rem=num%10;// Get the last digit (binary digit)
            dec=dec+((int)Math.pow(2,i)*rem);// Add to decimal value
            num=num/10;// Remove the last digit
            i++;
        }
        System.out.println("Decimal equivalent: " + dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num=sc.nextInt();
        conversion(num);
        sc.close();

    }
}