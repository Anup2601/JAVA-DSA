
import java.util.LinkedList;
import java.util.Queue;

public class FNRL{
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        int arr[] =new int[26];
        String s="aabccxb";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            arr[ch-'a']++;
                while(!q.isEmpty() && arr[q.peek()-'a']>1){
                    q.remove();
                }
                if(q.isEmpty()){
                    System.out.print("-1 ");
                }
                else{
                    System.out.print(q.peek()+" ");
                }
             
        }
    }
}