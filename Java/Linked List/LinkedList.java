public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insert(LinkedList list, int val) {

        Node m = new Node(val);
        m.next = null;

        if (list.head == null) {
            list.head = m;

        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = m;

        }
        // return list;
    }

    // Insert element feature for specific position
    public void inserAtPos(LinkedList l, int val, int pos) {
        Node t = l.head;
        Node new_node = new Node(val);
        if (pos > 1) {
            int i = 1;
            while (i != pos - 1) {
                t = t.next;
                i++;
            }
            new_node.next = t.next;
            t.next = new_node;
        } else if (pos == 1) {

            new_node.next = l.head;
            l.head = new_node;
        }

    }

    public void removeNode(LinkedList l, int pos) {
        Node x = l.head;
        Node prev = x;
        if (pos > 1) {

            int i = 1;
            while (i != pos) {
                prev = x;
                x = x.next;
                i++;
            }
            prev.next = x.next;
        } else if (pos == 1) {
            l.head = x.next;
        }
    }

    public void display(LinkedList list) {
        Node curr = list.head;
        System.out.print("Linked List:");
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("X");

    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        int a[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            l1.insert(l1, a[i]);
        }
        l1.display(l1); // display the list

        // Inserting element at specific position
        l1.inserAtPos(l1, 100, 1);
        l1.display(l1);

        l1.removeNode(l1, 1);
        l1.display(l1);

        l1.removeNode(l1, 3);
        l1.display(l1);
    }
}
