class Node{//creation of Node
    public int value;
    public Node next;
}

class SinglyLL{
    public Node head;
    public Node tail;
    public int size;
    public Node createSinglyLL(int nodevalue){
        head=new Node();
        Node node=new Node();
        node.value=nodevalue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insertAtHead(int nodevalue,int location){
        Node node =new Node();
        node.value=nodevalue;
        if(head==null){
            createSinglyLL(nodevalue);
            return;
        }
        else if(location==0){//insertion at the beginning of ll
            node.next=head;
            head=node;
        }
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{
            Node temp=head;
            int index=0;
            while(index<location-1){
                temp=temp.next;
                index++;
            }
            Node nextnode=temp.next;
            temp.next=node;
            node.next=nextnode;
        }
        size++;
    }
    public void printSinglyLL(){//traversing through the linked list
        Node temp=head;
        if(head==null){
            System.out.println("Singly Linked List is empty");
        }
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SinglyLL singlyll=new SinglyLL();
        singlyll.insertAtHead(10,0);
        singlyll.insertAtHead(30,1);
        singlyll.insertAtHead(40,2);
        singlyll.insertAtHead(70,1);
        singlyll.insertAtHead(80,3);
        singlyll.printSinglyLL();
       
    }
}
