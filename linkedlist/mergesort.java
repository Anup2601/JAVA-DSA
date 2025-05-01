
import java.util.LinkedList;

public class mergesort {
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

    public void addFirst(int data){
        // creat new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        
    }

    public Node mid(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public Node llmergesort(Node head){

       if(head!=null && head.next!=null){
        return head;
       }

       Node mid=mid();

       Node right=mid.next;
       mid.next=null;

       Node newright=llmergesort(right);
       Node newleft= llmergesort(head);

       return merg(newleft, newright);
    }

    public Node merg(Node left , Node rigth){
        Node rightHead=rigth;
        Node leftHead=left;
        Node mergll=new Node(1);
        Node temp=mergll;
        while(rightHead!=null && leftHead!=null){
            if(rightHead.data<=leftHead.data){
                temp=rightHead;
                rightHead=rightHead.next;
                temp=temp.next;
            }
            else{ 
                temp=leftHead;
                leftHead=leftHead.next;
                temp=temp.next;
            }
        }
        while(leftHead!=null){
            temp=leftHead;
            leftHead=leftHead.next;
            temp=temp.next;
        }
        while(rightHead!=null){
            temp=rightHead;
            rightHead=rightHead.next;
            temp=temp.next;
        }
        return mergll.next;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ ">");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        mergesort mll=new mergesort();
        mll.addFirst(10);
        mll.addFirst(14);
        mll.addFirst(50);
        mll.addFirst(30);
        mll.addFirst(33);
        mll.addFirst(20);
        mll.addFirst(90);
        mll.addFirst(60);
        mll.print();
        System.out.println("----------------------------");
        mll.head=mll.llmergesort(mll.head);
        mll.print();
    }
}
