public class ithBit{

    public static int Get_ith_bit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }


    public static void main(String[] args) {
        System.out.println(Get_ith_bit(10, 3));
    }
}