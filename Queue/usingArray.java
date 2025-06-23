public class usingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rare;
        Queue(int n){
            arr=new int[n];
            rare=-1;
            size=n;
        }
        // isEmpty
    public static boolean isEmpty(){
        return rare==-1;
    }
    // Enqueue
    public static void Enqueue(int data){
        if(rare==size-1){
            System.out.println("Queue id full");
            return;
        }
        rare+=1;
        arr[rare]=data;

    }
    // dequeue
    public static int Dequeue(){
        if(isEmpty()){
            return -1;
        }
        int front=arr[0];
        for(int i=0; i<rare;i++){
            arr[i]=arr[i+1];
        }
        rare-=1;
        return front;
    }
    // peek
    public static int Peek(){
         if(isEmpty()){
            return -1;
         }
         return arr[0];
    }
    }
    
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.Enqueue(12);
        q.Enqueue(34);
        q.Enqueue(23);
        while(!q.isEmpty()){
            System.out.println(q.Dequeue());
        }
    }
}
