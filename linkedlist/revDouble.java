public class revDouble {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
// using tail method
    // public void revres(){
    //     Node temp=tail;
    //     while(temp!=null){
    //         System.out.print(temp.data+">");
    //         temp=temp.prev;
    //     }
    // }
    public void revers(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ ">");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        revDouble dl=new revDouble();
        dl.addFirst(10);
        dl.addFirst(11);
        dl.addFirst(12);
        dl.addFirst(13);
        dl.addFirst(14);
        dl.addFirst(15);
        dl.addFirst(16);
        dl.addFirst(17);
        dl.addFirst(18);
        dl.addFirst(19);
        dl.addFirst(20);
        dl.print();
        dl.revers();
        System.out.println("----------------");
        dl.print();
    }
}
