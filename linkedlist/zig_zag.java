public class zig_zag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public Node mid(){
        Node fast=head.next;
        Node slow =head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public void revers(){
        Node mid=mid();
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        Node nextleft ,nextrigth;
        while(right!=null && left!=null){
            nextleft=left.next;
            left.next=right;
            nextrigth=right.next;
            right.next=nextleft;
            right=nextrigth;
            left=nextleft;
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
        zig_zag ll=new zig_zag();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        System.out.println("--------------");
        ll.revers();
        ll.print();
        System.out.println("-----------------");
    }
}
