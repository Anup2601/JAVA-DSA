public class sunOfNode {
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
    public static int sum(Node root){
        if(root== null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
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
        System.out.println(sum(root));
    }
}
