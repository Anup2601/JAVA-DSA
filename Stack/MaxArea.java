
import java.util.Stack;

public class MaxArea {
    public static void maxarea(int[] arr){
        int[] nsl=new int[arr.length];
        int[] nsr= new int[arr.length];
        int area=0;
        // nextsmall left
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // nextsmaller right 
        s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // max Area
        for(int i=0; i<arr.length;i++){
            int height=arr[i];
            int width= nsr[i]-nsl[i]-1;
            int currArea=height*width;
            area=Math.max(currArea, area);

        }
        System.out.println("Max area is :-"+area );

    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,1,3};
        maxarea(arr);
    }
}
