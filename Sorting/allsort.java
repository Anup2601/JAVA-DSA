class allsort{
    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
        System.out.println("bubble sort:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }  
    // selection 
    public static void selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int c=arr[i];
            arr[i]=arr[small];
            arr[small]=c;
        }
        System.out.println("Selection sort:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // insertion 
    public static void insertion(int arr[]){
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    int c=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=c;
                }
            }
        }
        System.out.println("Insertion sort:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // count sort 
    public static void count(int arr[]){
        int large=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large=Math.max(large, arr[i]);
        }
        int[] count=new int[large+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Count sort:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
        selection(arr);
        insertion(arr);
        count(arr);
    }
}

