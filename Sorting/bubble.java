class bubble{
    public static void main(String[] args) {
        int arr[]={5,3,1,2,4};
        // int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j+1]<arr[j]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }
}
