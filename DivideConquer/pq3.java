

public class pq3 {
    public static int merge(int [] arr,int s, int m,int e){
        int i=s;
        int j=m+1;
        int k=0;
        int ans=0;
        int temp[]=new int[e-s+1];
        while (i<=m && j<=e) {
            if(arr[i]>arr[j]){
                ans+=(m-i+1);
                temp[k++]=arr[j++];
            }
            else{
                temp[k++]=arr[i++];
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }

        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return ans;

    }
    public static int mergesort(int arr[],int s,int e){
        int inverscount=0;
        if(s>=e){
            return 0;
        }
        int m=s+(e-s)/2;
        inverscount+=mergesort(arr, s, m);
        inverscount+=mergesort(arr, m+1, e);
        inverscount+=merge(arr,s,m,e);
        return inverscount;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(mergesort(arr,0,arr.length-1));
    }

}
