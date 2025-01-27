// sort the array
public class p6 {
    public static boolean sort(int arr[],int i){
        if(arr[i]==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
    return sort(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        boolean t=sort(arr, 0);
        String r=t==true?"sort":"not-sort";
        System.out.println(r);
    }
}
