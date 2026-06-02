
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singl_to_circu {

    static Node convertToCircular(Node head) {
        if (head == null)
            return null;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head; 

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = convertToCircular(head);

        
        Node temp = head;
        for (int i = 0; i < 8; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
