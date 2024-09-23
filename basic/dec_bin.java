import java.util.*;
class dec_bin{
    // Method to convert decimal to binary
    public static void convert(int num){
        int bin=0,i=0;
        while(num>0){
            int rem=num%2;
            bin=bin+(int)(Math.pow(10, i)*rem);
            num=num/2;
            i++;
        }
        // String bin = "";
        // while (num > 0) {
        //     int rem = num % 2;
        //     bin = rem + bin; // Append remainder to the binary string
        //     num = num / 2;
        // }
        System.out.print(bin);
        
    }
    // Main Method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int num=sc.nextInt();
        convert(num);
        sc.close();
    }
}