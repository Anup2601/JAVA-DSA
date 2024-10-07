

class rainwater{
    public static int trappedrainwater(int height[]){
    int n=height.length;
    // calcuate left max boundry 
    int leftbound[]=new int[n];
    leftbound[0]=height[0];
    for (int i = 1; i < n; i++) {
        leftbound[i]=Math.max(leftbound[i-1], height[i]);
    }

    // calcuate right max boundary 
    int rightbound[]=new int[n];
    rightbound[n-1]=height[n-1];
    for (int i = n-2; i >= 0; i--) {
        rightbound[i]=Math.max(rightbound[i+1], height[i]);
    }
    // loop 
    int waterlevel;
    int trappedwater=0;
    for (int i = 0; i < n; i++) {
        // water level =min(leftmax,rightmax)
        waterlevel=Math.min(rightbound[i], leftbound[i]);
        // trapped water=waterlevel-height[i] 
        trappedwater+=waterlevel-height[i];
    }
    return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}