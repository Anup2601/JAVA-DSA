public class CircularQueue{
    public static class Queue{
        static int[] arr;
        static int size;
        static int rare;
        static int front;
         Queue(int n){
            arr=new int[n];
            size=n;
            rare=-1;
            front=-1;
        }
        // isEmpty
        public static boolean isEmpty(){
            return (front==-1 && rare==-1);
        }
        // Enqueue
        public static void Enqueue(int data){
            if((rare+1)%size==front){
                System.out.println("Queue id full");
                return;
            }
            if(front==-1){
                front=arr[0];
            }
            rare=(rare+1)%size;
            arr[rare]=data;
        }
        // Dequeue
        public static int Dequeue(){
            if(isEmpty()){
                return -1;
            }
            int data=arr[front];
            
            if(front == rare){
                front=rare=-1;
            }else{
                front=(front+1)%size;
            }
            return data;

        }
        // Peek
        public static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.Enqueue(12);
        q.Enqueue(16);
        q.Enqueue(18);
        q.Enqueue(19);
        q.Enqueue(20);
        while(!q.isEmpty()){
            System.out.println(q.Dequeue());
        }
    }
}