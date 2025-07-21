public class countOfNode {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int Count(Node root){
        if(root==null){
            return 0;
        }
        int lc=Count(root.left);
        int rc=Count(root.right);
        return lc+rc+1;
    }
    public static void main(String[] args) {
         Node root=new Node(1);
        root.left=new Node(3);
        root.right= new Node(8);
        root.left.left= new Node(8);
        root.left.right= new Node(2);
        root.right.left= new Node(5);
        root.right.right= new Node(7);
        root.right.right.right=new Node(8);
        System.out.println(Count(root));
    }
}
