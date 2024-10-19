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
public class LinkedList{
    private static Node arr2ll(int[]arr){//converting array to linkedlist 
        Node head=new Node(arr[0]);//creating head node with arr[0]
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);//creading next node with next elements of arr
            mover.next=temp;//storing the next path of node with arr.
            mover=temp;
        }
        return head;
    }
    private static int length(Node head){//to obtain the length of linkedlist
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    private static boolean findElement(Node head,int val){//finding an element in ll
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public  static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        Node head=arr2ll(arr);//convert arr to ll
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);//iterating through ll
            temp=temp.next;
        }
        int result=length(head);//obtaining length of ll.
        System.out.println("Length of linkedlist is: "+result);

        boolean result1=findElement(head, 3);//finding element in ll
        System.out.println("Element found: "+result1);
    }

}