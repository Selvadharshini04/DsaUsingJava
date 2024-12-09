public class Stack{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                next=null;
            }
        }
        static class Stacks{
            public static Node head;

            public static boolean isEmpty(){
                return head==null;
            }

            public static void push (int data){
                Node newnode=new Node(data);
                if(isEmpty()){
                    head=newnode;
                    return;
                }
                newnode.next=head;
                head=newnode;
            }

            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top=head.data;
                head=head.next;
                return top;
            }

            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
 
        }
    
    public static void main(String [] args){
        Stacks s =new Stacks();
        s.push(10);
        s.push(20);
        s.push(30);
        System.err.println(s.pop());
        System.err.println(s.peek());
    }
}
