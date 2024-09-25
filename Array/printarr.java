import java.util.Scanner;
public class printarr{
    public static void update(int marks[]){
        for (int i = 0; i < marks.length;i++) {
            marks[i]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i]=sc.nextInt();
        }
        update(marks);
        for (int i = 0; i <marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}