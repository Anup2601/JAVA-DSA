public class odd_even {
    public static void main(String[] args) {
        int num=34;
        int bitmask=1;
        if((num & bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
