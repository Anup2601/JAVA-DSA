public class rotatedArr {
    public static void findIdx(int arr[],int Target,int s,int e){
        if(s>e){
            return;
        }
        int m=s+(e-s)/2;
        if(arr[m]==Target){
            System.out.println(m);
        } 
            if(arr[s]<arr[m]){
                // do work in line 1
                if(arr[s]<=Target && Target<=arr[m]){
                    // l1 ke start mai hoga
                    findIdx(arr, Target, s,m-1 );
                }else{
                    // l1 ke eng ya 2l
                    findIdx(arr, Target, m+1, e);
                }
            }
            else{
                // do work in line 2
                if(arr[m]<=Target && Target<=arr[e]){
                    // l2 ke end mai
                    findIdx(arr, Target, m+1, e);
                }
                else{
                    // l1 ka start ya l1
                    findIdx(arr, Target, s, m-1);
                }
            }
        
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int Target=0;
        int s=0;
        int e=arr.length-1;
        findIdx(arr, Target,s,e);
    }
}
