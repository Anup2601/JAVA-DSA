class insertion_short{
    public static void main(String[] args) {
        int[] arr={1,4,3,8,2,7};
        for (int i = 1; i < arr.length; i++) {
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}