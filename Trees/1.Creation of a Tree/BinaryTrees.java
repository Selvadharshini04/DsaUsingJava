public class BinaryTrees{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int []nodes){
           index++;
           if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }
           Node newnode=new Node(nodes[index]);
           newnode.left=buildTree(nodes);
           newnode.right=buildTree(nodes);
           return newnode;
        }
    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes); 
        System.out.print(root.data);
    }
}
