class selection{
    public static void main(String[] args) {
        int arr[]={4,2,5,1,3};
        for (int i = 0; i < arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}