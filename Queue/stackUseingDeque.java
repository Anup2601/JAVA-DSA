
import java.util.Deque;
import java.util.LinkedList;


class stackUseingDeque{
    static class stack{
        Deque<Integer> dq=new LinkedList<>();
        // isEmpty
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        // push
        public void push(int data){
            dq.addLast(data);
        }
        // pop
        public int pop(){
            return dq.removeLast();
        }
        // peek
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        stack s= new stack();
        s.push(12);
        s.push(17);
        s.push(15);
        s.push(13);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}