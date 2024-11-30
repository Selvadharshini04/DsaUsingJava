class Node{
    int value;
    Node next;
}
class SinglyLL{
    public Node head;
    public Node tail;
    int size=1;
    public Node createSingly(int nodevalue){
        Node node=new Node();
        node.value=nodevalue;
        head =new Node();
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insert(int nodevalue,int location){
        Node node=new Node();
        node.value=nodevalue;
        if(head==null){
            createSingly(nodevalue);
            return;
        }
        else if(location==0){
            node.next=head;
            head=node;
        }
        else if(location >=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{
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
    public void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public boolean searchElement(int nodevalue){//Searchinf for the element
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.value==nodevalue){
                System.out.println("Element is found at index:"+ i);
                return true;
            }
            temp=temp.next;
        }
        return false;
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
        singlyll.searchElement(30);
    }
}

