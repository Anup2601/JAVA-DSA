public class pq1 {
    public static void printArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static boolean alphabateCompare(String str1,String str2){
        return str1.compareTo(str2)<0;
    }
    public static void merge(String arr[],int s,int m,int e){
      
            int i=s;
            int j=m+1;
            String temp[]=new String[e-s+1];
            int k=0;
            while( i<=m && j<=e){
                if(alphabateCompare(arr[i],arr[j])){
                    temp[k++]=arr[i++];
                }else{
                    temp[k++]=arr[j++];
                }
            }
            while(i<=m){
                temp[k++]=arr[i++];
            }
            while(j<=e){
                temp[k++]=arr[j++];
            }
            // copy array
            for(k=0,i=s;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
        }
     
    public static void mergesort(String arr[],int s,int e){
        if(s>=e){
            return;
        }
        int m=s+(e-s)/2;
        mergesort(arr, s, m);
        mergesort(arr, m+1, e);
        merge(arr,s,m,e);
    }
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury"};
        mergesort(arr,0,arr.length-1);
        printArr(arr);
    }
}
