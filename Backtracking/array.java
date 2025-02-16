public class array {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void sum(int arr[],int n,int value){
        if(n==arr.length){
            printArr(arr);
            return;
        }
        arr[n]=value;
        sum(arr, n+1, value+1); //recurtion
        arr[n]=arr[n]-2;
        
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        sum(arr,0, 1);
        printArr(arr);
    }
}
