class kadanes{
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        for (int i =0; i <arr.length ; i++) {
            arr[i]=i==0?arr[0]:arr[i-1]+arr[i];
            if(arr[i]<0){
                arr[i]=0;
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max subarray is "+max);
    }
}