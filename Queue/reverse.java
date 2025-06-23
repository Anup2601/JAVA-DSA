
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class reverse{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s= new Stack<>();
        q.add(12);
        q.add(10);
        q.add(9);
        q.add(15);
        q.add(13);
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}