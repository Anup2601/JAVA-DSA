// to find the first occurance
public class p7 {
    public static int FO(int[] arr,int i,int key ){
        if(arr[i]==arr.length-1){
            return 0;
        }
        if(arr[i]==key){
            return i;
        }
        return FO(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,4,2,3,43,2,4,4,33,4,3};
        int k=33;
        System.out.println(FO(arr, 0, k));
    }
}
