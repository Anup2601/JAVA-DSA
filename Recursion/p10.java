// optimized poewr function
class p10{
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPow=pow(x, n/2);
        int halfPowSq=halfPow*halfPow;
        if(n%2!=0){
            return x*halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(pow(x, n)); 
    }
}