
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class  rev_the_node_dl {

    static Node reverse(Node head) {

        Node temp = null;
        Node curr = head;

        while (curr != null) {

            
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            
            curr = curr.prev;
        }

       
        if (temp != null)
            head = temp.prev;

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        head = reverse(head);

        printList(head);
    }
}
