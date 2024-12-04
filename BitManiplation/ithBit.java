public class ithBit{

    public static int Get_ith_bit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int set_ith_bit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clear_ith_bit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int update_ith_bit(int n,int i,int newBit){
        n=clear_ith_bit(n, i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }

    public static int clear_last_iBit(int n,int i){
        int bitMask=~(0)<<i;
        return n&bitMask;
    }

    public static int clear_rangeof_bit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=((1<<i)-1);
        int c=a|b;
        return n&c;
    }

    public static void powerOf2(int n){
        if((n&(n-1))==0){
            System.out.println("yes");
        }
        else
        System.out.println("no");
    }

    public static void countSetBit(int n){
        int c=0;
        while(n>0){
            if((n&1)==1){
                c++;
            }
            n=n>>1;
        }
        System.out.println(c);
    }

    public static void fastexpo(int a,int n){
        int ans=1;
        while(0<n){
            if((1&n)!=0){
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        System.out.println(Get_ith_bit(10, 3));
        System.out.println(set_ith_bit(10, 2));
        System.out.println(clear_ith_bit(10, 1));
        System.out.println(update_ith_bit(10, 0, 1));
        System.out.println(clear_last_iBit(15, 2));
        System.out.println(clear_rangeof_bit(10, 2, 4));
        powerOf2(12);
        countSetBit(10);
        fastexpo(3, 5);
    }
}