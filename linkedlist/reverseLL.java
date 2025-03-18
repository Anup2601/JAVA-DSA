// package linkedlist;



public class reverseLL {
    
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

    public void addfirst(int data){
        Node temp =head;
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        newnode.next=temp;
        head=newnode;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void reverse(){
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
   public static void main(String[] args) {
    reverseLL ll=new reverseLL();
    ll.addfirst(1);
    ll.addfirst(2);
    ll.addfirst(3);
    ll.addfirst(4);
    ll.addfirst(5);
    ll.addfirst(6);
    System.out.println("Original Array");
    ll.print();
    ll.reverse();
    System.out.println("Reverse Array");
    ll.print();
   } 
}
