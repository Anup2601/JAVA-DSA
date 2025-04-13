class dellast{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void del(int idx){
        int size=0;
        Node temp =head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(head==null){
            System.out.println("linklist is empty");
        }
        if(head==tail){
            head=tail=null;
        }
        if(idx==size){
            head=head.next;
        }
        temp=head;
        for (int i=0;i<(size-idx-1);i++){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" >");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        dellast ll=new dellast();
        ll.addFirst(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);
        System.out.println("----------------------------------");
        ll.print();
        ll.del(2);
        ll.del(1);
        System.out.println("------------------------------------");
        ll.print();
    }
}