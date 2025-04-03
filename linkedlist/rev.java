


class rev{
    public class Node{
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

    public void addlast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void print(){
        Node temp=head;
        if(head==null){
            System.out.print("Linkedlist is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+">");
            temp=temp.next;
        }
    }

    public void addMiddle(int data, int idx){
        Node temp=head;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=null;
        }
        if(idx==0){
            addFirst(data);
        }
        int i=0;
        while(i<idx-1){
            i++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int deleteFirst(){
        Node temp=head;
        if(head==null){
            System.out.println("Linkedlist is Empty");
            return -1;
        }
        if(head==tail){
            int val=temp.data;
            head=tail=null;
            return val;
        }
        int val=temp.data;
        head=temp.next;
        return val;
    }

    public int deletelast(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is Empty");
            return -1;
        }
        if(head==tail){
            int val=head.data;
            head=tail=null;
            return val;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        return val;
    }
    public int deleteMiddle(int idx){
        Node temp=head;
        int i=0;
        if(head==null){
            System.out.println("Linked list is Empty");
            return -1;
        }
        if(head==tail){
            int val=head.data;
            head=tail=null;
            return val;
        }
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        int val=temp.next.data;
        temp.next=temp.next.next;
        return val;
    }

    public int search(int key){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is Empty");
            return -1;
        }
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Found" + key);
                return key;
            }
            temp=temp.next;
        }
        System.out.println("Not Found");
        return -1;
    }
    public static void main(String[] args) {
        rev r=new rev();
        r.addFirst(12);
        r.addFirst(11);
        r.addFirst(10);
        r.print();
        System.out.println();
        System.out.println("--------------------------");
        r.addlast(9);
        r.addlast(8);
        r.addlast(7);
        r.print();
        System.out.println();
        System.out.println("--------------------------------");
        r.addMiddle(99, 2);
        r.addMiddle(79, 4);
        r.addMiddle(89, 5);
        r.print();
        System.out.println();
        System.out.println("--------------------------------");
        r.deleteFirst();
        r.print();
        System.out.println();
        System.out.println("--------------------------------");
        r.deletelast();
        r.print();
        System.out.println();
        System.out.println("--------------------------------");
        r.deleteMiddle(1);
        r.deleteMiddle(4);
        r.print();
        System.out.println();
        r.search(89);
        
    }
}