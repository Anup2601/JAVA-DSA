class pq2{
    public static void numToStr(int rev){
        
        if(rev==0){
            return;
        }
        if(rev%10==1){
            System.out.print(" one");
        }
        if(rev%10==2){
            System.out.print(" two");
        }
        if(rev%10==3){
            System.out.print(" three");
        }
        if(rev%10==4){
            System.out.print(" four");
        }
        if(rev%10==5){
            System.out.print(" five");
        }
        if(rev%10==6){
            System.out.print(" six");
        }
        if(rev%10==7){
            System.out.print(" seven");
        }
        if(rev%10==8){
            System.out.print(" eight");
        }
        if(rev%10==9){
            System.out.print(" nine");
        }
        if(rev%10==0){
            System.out.print(" zero");
        }
        numToStr(rev/10);
    }
    public static void main(String[] args) {
        int a=1947;
        int rev=0;
        while(a!=0){  
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        numToStr(rev);
    }
}