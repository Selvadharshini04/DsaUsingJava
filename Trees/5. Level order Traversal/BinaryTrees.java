import java.util.*;
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
    public static void preordertraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }
    public static void levelordertraversal(Node root){
        if(root == null){
            return;
        }
        Queue <Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node currnode=queue.remove();
            if(currnode == null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                System.out.print(currnode.data+"  ");
                if(currnode.left!= null){
                    queue.add(currnode.left);
                }
                if(currnode.right!= null){
                    queue.add(currnode.right);
                }

            }

        }

    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes); 
        //System.out.print(root.data);
        levelordertraversal(root);
    }
}



output:
1  
2  3  
4  5  6  
