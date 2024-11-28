public class SinglyLL{
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodevalue){
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.data=nodevalue;
        head=node;
        tail=node;
        size=1;
        return head;
    }
}
