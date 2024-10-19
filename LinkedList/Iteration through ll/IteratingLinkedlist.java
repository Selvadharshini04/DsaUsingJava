class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class IteratingLinkedlist{
    public static Node convertarr2ll(int[] arr){
        Node head=new Node(arr[0]);
        Node mover =head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            mover.next=newNode;
            mover=newNode;
        }
        return head;
    }
    public static void  iterating(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String []args){
        int[]arr={10,20,30,40,50};
        Node head=convertarr2ll(arr);//converting arr to linkedList and printing head
        System.out.println(head.data);
        iterating(head);//iterating through linkedlist
    }
}