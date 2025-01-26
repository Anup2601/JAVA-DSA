// to find sum natural number from 1 to 50
class natural{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int n_1=sum(n-1);
        int s=n+n_1;
         return s;
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(sum(25)); 
    }
}