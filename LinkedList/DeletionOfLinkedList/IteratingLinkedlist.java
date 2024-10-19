/*----------------------------------------Deletion in linked list-----------------------------------------------------------
 * 1.deleting the head node of the linkedlist
 * 
 */
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

    //1.deleting the head of the linkedlist 
    public static Node deleteHead(Node head){
        if(head==null){
            return head;
        }
        head=head.next;//changing the head to the immediate next node 
        return head;
    }


    //2.deleting the tail of the linkedlist
    public static Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        iterating(head);
        return temp;
    }
    public static void main(String []args){
        int[]arr={10,20,30,40,50};

        Node head=convertarr2ll(arr);//converting arr to linkedList and printing head
        System.out.println(head.data);

        iterating(head);//iterating through linkedlist

        /*Node headdelete=deleteHead(head);//deleting the head of the Linkedlist
        System.out.println(headdelete.data);*/

        Node tailDelete=deleteTail(head);//deleting tail of the linkedlist
        System.out.println(tailDelete.data);
    }
}
