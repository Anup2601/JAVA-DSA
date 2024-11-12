class q2{
    public static void main(String[] args) {
        int[][] arr={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}