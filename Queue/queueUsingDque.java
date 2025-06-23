
import java.util.Deque;
import java.util.LinkedList;

class queueUsingDque{
    static class queue {
        Deque<Integer> dq = new LinkedList<>();
    
        // isEmpty
        public boolean isEmpty(){
            return dq.isEmpty();
        }
        // add
        public void add(int data){
            dq.addLast(data);
        }
        // remove
        public int remove(){
            return dq.removeFirst();
        }
        // peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(10);
        q.add(18);
        q.add(19);
        q.add(16);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}