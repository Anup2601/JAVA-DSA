
import java.util.Stack;

public class NextGen {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        int[] arr={6,8,0,1,3};
        int[] nextgen =new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgen[i]=-1;
            }
            else{
                nextgen[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextgen.length;i++){
            System.out.println(nextgen[i]);
        }
    }

}
