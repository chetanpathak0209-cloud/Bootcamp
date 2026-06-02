
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class rem_cycle {

    static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle)
            return;

        
        slow = head;

        if (slow == fast) {
            while (fast.next != slow)
                fast = fast.next;
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

       
        fast.next = null;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        
        head.next.next.next.next.next = head.next.next;

        removeCycle(head);

        printList(head);
    }
}
