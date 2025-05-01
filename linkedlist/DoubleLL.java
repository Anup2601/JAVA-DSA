public class DoubleLL {
    public  static class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
            head.prev=newNode;
            head=newNode;
        }
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=tail=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        tail=newNode;
       
    }

    public void removeFirst(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked List is enpty");
        }
        else{
            temp=temp.next;
            temp.prev=null;
            head=temp;
        }
    }

    public void removeLast(){
        Node temp=head;
        if(temp==null){
            System.out.println("ll is empty");
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
            
        }
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ ">");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        DoubleLL ll=new DoubleLL();
        ll.addFirst(10);
        ll.addFirst(13);
        ll.addFirst(12);
        ll.addFirst(11);
        ll.print();
        ll.addlast(21);
        ll.addlast(22);
        ll.addlast(23);
        System.out.println("------------------");
        ll.print();
        System.out.println("======");
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        System.out.println("-----------------");
        ll.print();
    }
}
