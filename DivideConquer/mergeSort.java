public class mergeSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergesort(arr,s,mid);
        mergesort(arr, mid+1, e);
        merg(arr,s,mid,e);

    }
    public static void merg(int arr[],int s,int mid,int e){
        int i=s; //idx for first sorted path
        int j=mid+1; //idx for second sortest path
        int k=0; //idx for temp
        int temp[]=new int[e-s+1];

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for first sortest path
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // for second sortest path
        while(j<=e){
            temp[k++]=arr[j++];
        }
        // for copy the array
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={4,8,2,9,3,1,5,6,7};
        mergesort(arr,0,arr.length-1);
        printArr(arr);
    }
}