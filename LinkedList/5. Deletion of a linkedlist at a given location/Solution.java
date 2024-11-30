class Node{
    int value;
    Node next;
}
class SinglyLL{
    public Node head;
    public Node tail;
    int size=1;
    public Node createSingly(int nodevalue){//creating a single node
        Node node=new Node();
        node.value=nodevalue;
        head =new Node();
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insert(int nodevalue,int location){//insertion of node
        Node node=new Node();
        node.value=nodevalue;
        if(head==null){
            createSingly(nodevalue);
            return;
        }
        else if(location==0){//insertion of node as first
            node.next=head;
            head=node;
        }
        else if(location >=size){//insertion of node at last
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{//insertion of node in middle
            Node temp=head;
            int index=0;
            while(index < location-1){
                temp=temp.next;
                index++;
            }
            Node nextnode=temp.next;
            temp.next=node;
            node.next=nextnode;
        }
        size++;
    }
    public void traverse(){// traversing the list
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    /*public boolean searchElement(int nodevalue){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.value==nodevalue){
                System.out.println("Element is found at index:"+ i);
                return true;
            }
            temp=temp.next;
        }
        return false;
    }*/
    public void delete(int location){//deletion of element at a partivular location
        Node temp=head;
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(location==0){//deletion of element at first position
            
            if(size==1){
                head=null;
                tail=null;
                return;
            }
            head=head.next;
            size--;
        }
        else if(location == size - 1){//deletion of element at last position
            for(int i = 0; i < size - 2; i++){
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = null;
            }
            tail = temp;
            size--;
        }
        
        else{//deletion of element in middle position
            for(int i=0;i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        SinglyLL singlyll=new SinglyLL();
        singlyll.createSingly(10);
        singlyll.insert(20,1);
        singlyll.insert(30,2);
        singlyll.insert(40,3);
        singlyll.insert(50,4);
        singlyll.traverse();
        System.out.println("Deleting...................");
        singlyll.delete(4);
        singlyll.traverse();
    }
}

