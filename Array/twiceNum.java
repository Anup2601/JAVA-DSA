class twiceNum{
    public static boolean  twice(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                } 
                
            }
             
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(twice(arr));
    }
}