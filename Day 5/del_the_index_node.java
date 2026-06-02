
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class del_the_index_node {

    static Node deleteAtIndex(Node head, int index) {

        if (head == null)
            return null;

        
        if (index == 0) {

            if (head.next == head)
                return null;

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;

            return head;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;

            if (curr.next == head)
                return head; 
        }

        curr.next = curr.next.next;

        return head;
    }

    static void printList(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head; 

        head = deleteAtIndex(head, 2);

        printList(head);
    }
}