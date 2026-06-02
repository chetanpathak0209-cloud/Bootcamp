
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class count_occ  {

    static int countOccurrence(Node head, int key) {
        int count = 0;

        while (head != null) {
            if (head.data == key) {
                count++;
            }
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(2);

        int key = 2;

        System.out.println(countOccurrence(head, key));
    }
}
