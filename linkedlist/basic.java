

class basic{
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
        // creat new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        // link
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void addMiddle(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        if(head==null){
            head=tail=newNode;
        }
        while(i<index-1){
            i++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int deleteFirst(){
        if(size==0){
            System.out.println("liskedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }

    public int deletelast(){
        Node temp=head;
        if(size==0){
            System.out.println("ll is empty");
        }
        if(size==1){
            int val=temp.data;
            head=tail=null;
            size=0;
            return val;
        }
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public int search(int key){
        Node temp=head;
        for(int i=0;i<size-1;i++){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public int help(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=help(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recursionSearch(int key){
        return help(head , key);
    }
    public static void main(String[] args) {
        basic ll=new basic();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addlast(12);
        ll.addlast(13);
        ll.addlast(14);
        ll.addMiddle(21, 4);
        ll.addMiddle(22, 5);
        ll.addMiddle(21, 6);
        ll.print();
        System.out.println("size is:-"+ll.size);

        ll.deleteFirst();
        ll.print();
        System.out.println("size is:-"+ll.size);

        ll.deletelast();
        ll.print();
        System.out.println("size is:-"+ll.size);
        System.out.println(ll.search(12));
        System.out.println(ll.recursionSearch(21    ));
    }
}