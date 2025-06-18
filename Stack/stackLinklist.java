class stackLinklist{
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    } 
    public static Node head = null;

    // isEmpty
    public static boolean  isEmpty(){
        return head==null;
    }

    // push
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }    
    // pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            int top=head.data;
            head=head.next;
            return top;
        }
    }
    // peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }else{
            int top=head.data;
            return top;
        }
    }
    public static void print(){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
       stackLinklist list =new stackLinklist();
       list.push(07); 
       list.push(06); 
       list.push(05); 
       list.push(06); 
       list.push(03); 
       list.push(02); 
       list.push(101); 
       list.push(10); 
       list.pop();
    //    list.print();
       while(!list.isEmpty()){
        System.out.print(list.peek()+">");
        list.pop();
       }

    }
}