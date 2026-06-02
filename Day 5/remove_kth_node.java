
    
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class remove_kth_node {

    static Node removeEveryKth(Node head, int k) {
        if (k <= 0) return head;
        if (k == 1) return null;

        Node curr = head;
        Node prev = null;
        int count = 1;

        while (curr != null) {
            if (count % k == 0) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
            count++;
        }

        return head;
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
        

        head = removeEveryKth(head, 3);

        printList(head);
    }
}
