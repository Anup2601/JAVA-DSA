public class rrll {
    class Node{
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
    public void rev(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " >");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        rrll r=new rrll();
        r.addFirst(10);
        r.addFirst(11);
        r.addFirst(12);
        r.print();
        r.rev();
        System.out.println("--------------------------");
        r.print();
    }
}
