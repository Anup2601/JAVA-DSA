// to calculate the power
class p9{
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }

        return x*pow(x, n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=4;
        System.out.println(pow(x, n)); 
    }
}