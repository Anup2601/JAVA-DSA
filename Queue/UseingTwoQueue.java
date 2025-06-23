
import java.util.LinkedList;
import java.util.Queue;

public class UseingTwoQueue {
    public static class stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        // isEmpty
        public static boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        // push
        public static void push(int data){
            if(!isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        // pop
        public static int pop(){
            int top=-1;
            if(isEmpty()){
                return -1;
            }
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        // peek
        public static int peek(){
            int top=-1;
            if(isEmpty()){
                return -1;
            }
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                }
                q2.add(top);
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                }
                q1.add(top);
            }
            return top;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(16);
        s.push(12);
        s.push(13);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
