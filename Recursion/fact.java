class fact{
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        int a=n*factorial(n-1);
        return a;
        // System.out.println(factorial(n)*factorial(n-1));
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}