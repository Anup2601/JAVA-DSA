public class hightOfTree {
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int hight(Node root){
        if(root==null){
            return 0;
        }
        int lh=hight(root.left);
        int rh=hight(root.right);
        return Math.max(lh, rh)+1;
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
        System.out.println(hight(root));
    }
}
