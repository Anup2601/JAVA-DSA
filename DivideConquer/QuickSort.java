class QuickSort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partation(int arr[],int s,int e){
        while(s<=e){
            int i=s-1;
            int p=arr[e];
            for(int j=s;j<arr.length;j++){
                if(arr[j]<p){
                    // swap
                    i++;
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
            // swap
            i++;
            int t=p;
            arr[e]=arr[i];
            arr[i]=t;
            
            return i;
        }
        return 0;
        
    }
    public static void quicksort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int pidx=partation(arr,s,e);
        quicksort(arr, s, pidx-1);
        quicksort(arr, pidx+1, e);
    }
    public static void main(String[] args) {
        int arr[]={9,3,4,1,6,2,5,7,8};
        quicksort(arr,0,arr.length-1);
        printArr(arr);
    }
}