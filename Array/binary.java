import java.util.*;

class binary{
    public static int search(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // found 
            if(arr[mid]==key){
                return mid;
            }
            // left
            if(arr[mid]>key){
                end=mid-1;
            }
            // right 
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // declare of array of size 10 
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        // taking input from user  
        System.out.println("Enter the shorted array");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        // taking key from user 
        System.out.println("Enter the key you want to search");
        int key=sc.nextInt();
        // passing to function 
        int index=search(arr, key);
        if(index!=-1){
            System.out.println("Index of key is "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}