// to find the fibonacci number
class fibo{
    public static int f(int n){
        if(n==0||n==1){
            return n;
        }
        int n_1=f(n-1);
        int n_2=f(n-2);
        int a=n_1+n_2;
        // System.out.println(a+" ");
        return a;
    }
    public static void main(String[] args) {
        int n=100;
        for(int i=0;i<=n;i++){
            System.out.println(f(i));
        }
    }
}