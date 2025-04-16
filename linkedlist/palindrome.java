class palindrome{
    public  static class Node{
        int data;
        Node next;
        public Node( int data){
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
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("ll is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+ " >");
            temp=temp.next;
        }
        System.out.println("--------------------------");
    }
    public Node mid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean  cheak(){
        if(head==null || head.next==null){
            return true;
        }
        // reverse
        Node prev=null;
        Node curr=mid();
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
                
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }
    public static void main(String[] args) {
        palindrome ll=new palindrome();
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(12);
        ll.print();
        System.out.println(ll.cheak());
    }
}