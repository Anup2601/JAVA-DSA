class Binomial{
    // to calculate factioral 
    public static int fact(int num){
        int f=1;
        for (int i=1;i<=num;i++){
            f*=i;
        }
        return f;
    }
    // to calculate binomial cofficient 
    public static void bino(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int bin=(a/(c*b));
        System.out.println("binomial cofficient is :-"+ bin);
    }
    // main function 
    public static void main(String args[]){
         int n=5;
         int r=3;
         bino(n, r);
    }
}