

class prefix_sum{
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int pre[]=new int[5];
        int sum=0;
        int max=Integer.MIN_VALUE;
        pre[0]=arr[0];

        for (int i = 1; i < arr.length; i++) {
            pre[i]=pre[i-1] +arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=i==0?pre[j]:pre[j]-pre[i-1];
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("max of subarray is "+max);
    }
}