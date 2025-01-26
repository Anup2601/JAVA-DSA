// to find negative natural number from 10 to1
class q1{
    public  static void printDec(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.println(num+" ");
        printDec(num-1);
    }
    public static void main(String[] args) {
         int n=10;
         printDec(n);
    }
}