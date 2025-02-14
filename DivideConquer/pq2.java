public class pq2 {
    public static int countInRange(int arr[],int n,int s,int e){
        int c=0;
        for(int i=s;i<=e;i++){
            if(arr[i]==n){
                 c++;
            }
        }
        return c;
    }
    public static int majorityElement(int arr[],int s, int e){
        if(s==e){
            return arr[s];
        }
        int m=s+(e-s)/2;
        int left =majorityElement(arr, s, m);
        int right =majorityElement(arr, m+1, e);
        if(left==right){
            return left;
        }
        int leftcount=countInRange(arr,left,s,e);
        int rightcount=countInRange(arr,right,s,e);
        return leftcount>rightcount?left:right;


    }
    public static void main(String[] args) {
        int arr[]={8,7,8,6,5};
        System.out.println(majorityElement(arr,0,arr.length-1));
        
    }
}
