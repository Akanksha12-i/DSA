public class LinkedList {
    
    Node head;
    class Node{
         int data;
         Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public  void insert(LinkedList list,int val){
       
        Node m=new Node(val);
        m.next=null;
        
        if(list.head==null){
           list.head=m;

        }else{
            Node curr=list.head;
            while(curr.next!=null){
              curr=curr.next;
            }
            curr.next=m;

        }
     // return list;
    }

    public void display(LinkedList list){
        Node curr=list.head;
        System.out.print("Linked List:");
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("X");

    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        
       l.insert(l,56);
       l.insert(l,596);
       l.insert(l,74);
        l.display(l);

        LinkedList l1=new LinkedList();
        
        l1.insert(l1,55);
        l1.insert(l1,6);
        l1.insert(l1,7);
 
         l1.display(l1);
    }
}
