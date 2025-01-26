public class p6 {
    public static boolean sort(int arr[],int i){
        if(arr[i]==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
        sort(arr,i+1);
        return true;
    }
    return true;
    }
    public static void main(String[] args) {
        int[] arr=[1,2,3,4,5,6,7];
        int t=sort(arr, i)
    }
}
