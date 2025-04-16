public class removeCycle {
     static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public static boolean cheak(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
            
        }
        return false;
    }
    public static void remove(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        slow=head;
        Node prev=null;
        // Special case: when the cycle starts at head
        if (slow == fast) {
            // Find the last node in the cycle
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head;
        System.out.println(cheak());
        remove();
        System.out.println(cheak());
    }
}
