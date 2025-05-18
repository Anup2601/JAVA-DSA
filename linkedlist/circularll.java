



public class circularll {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // public static Node head;

    static Node addToEmptyNode(int data, Node last){
        if(last!=null){
            return last;
        }
        Node newNode=new Node(data);
        last=newNode;
        newNode.next=last;
        return last;
    }

    static Node addFirst(int data, Node last){
        if(last==null){
            return addToEmptyNode(data, last);
        }else{
            Node newNode=new Node(data);
            newNode.next=last.next;
            last.next=newNode;
            return last;
        }
    }

    static void print(Node last){
        Node temp=last.next ;
        do{
            System.out.print(temp.data+ ">");
            temp=temp.next;
        }while(temp!=last.next);
    }
    
    public static void main(String[] args) {
       Node last=null;
       last=addToEmptyNode(6, last);
       last=addFirst(10,last);
       last=addFirst(11,last);
       last=addFirst(12,last);
       print(last);
    }
}
