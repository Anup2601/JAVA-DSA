class callBYvalue{
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Inside swaping a= "+a+" b= "+b);

    }
    // main function 
    public static void main(String[] args) {
        int a=12;
        int b=4;
        System.out.println("Before swaping a= "+a+" b= "+b);
        swap(a,b);
        System.out.println("After swaping a= "+a+" b= "+b);
    }
}