public class p8 {
    public static int LO(int[] arr,int i,int key){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return LO(arr, i-1, key);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,7,6,4,3,2,3,45,6,2};
        int i=arr.length-1;
        int key=4;
        System.out.println(LO(arr, i, key));
    }
    
}
