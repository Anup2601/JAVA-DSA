public class aver{ 
    public static void main(String[] args) {
        sum s=new sum(10, 121);
        System.out.println(s.c);
    }
}
class sum{
    int c;
    sum(int a,int b){
         c=a+b;
    }
        
}