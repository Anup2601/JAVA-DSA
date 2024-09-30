public class harsh {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void boi(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int com=0;
        com=(a/(b*c));
        System.out.println(com);
    }
    public static void main(String[] args) {
    boi(5, 2);   
    System.out.println(fact(5));
    }
}
