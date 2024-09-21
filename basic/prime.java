import java.util.*;
public class prime{
    // Method to check if a number is prime
    public static int cheakPrime(int num){
        if(num<=1) return 0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return 0;//for not prime no.
            }
        }
        return 1;// for prime number    
    }
// Method to print all prime numbers up to 'num'
    public static void printPrime(int num){
        System.out.println("The prime numbers up to " + num + " are:");
        for(int i=2;i<=num;i++){
            if(cheakPrime(i)==1){
                System.out.println(i);// Print the prime number
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to print prime no.");
        int n=sc.nextInt();
        printPrime(n);// Call method to print primes
        sc.close();
    }
}