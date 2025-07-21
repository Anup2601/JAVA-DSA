
import java.util.Scanner;

class vowels{
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your text");
        String s=sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("No. of vowels in string is :-"+count);
    }
}