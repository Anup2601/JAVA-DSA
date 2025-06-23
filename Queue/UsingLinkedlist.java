class UsingLinkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
        public static boolean isEmpty(){
           return head==null;
        }
     // Inqueue
        public static void Inqueue(int data){
            Node temp=head;
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            while(temp.next!= null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        // Dequeue
        public static int Dequeue(){
            if(isEmpty()){
                return -1;
            }
            int data=head.data;
            if(head.next==null){
                head=null;
            }else{
                head=head.next;
            }
            
            return data;
        }
        // Peek
        public static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;

        }
    public static void main(String[] args) {
        UsingLinkedlist ll =new UsingLinkedlist();
        ll.Inqueue(12);
        ll.Inqueue(17);
        ll.Inqueue(18);
        ll.Inqueue(11);
       
        while(!ll.isEmpty()){
            System.out.println(ll.Dequeue());
        }
    }
}