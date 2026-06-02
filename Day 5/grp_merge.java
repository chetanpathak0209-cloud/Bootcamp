
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class grp_merge  {

    static Node mergeTwo(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) tail.next = a;
        if (b != null) tail.next = b;

        return dummy.next;
    }

    static Node mergeK(Node[] lists, int start, int end) {
        if (start == end)
            return lists[start];

        int mid = (start + end) / 2;

        Node left = mergeK(lists, start, mid);
        Node right = mergeK(lists, mid + 1, end);

        return mergeTwo(left, right);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(4);
        l1.next.next = new Node(7);

        Node l2 = new Node(2);
        l2.next = new Node(5);
        l2.next.next = new Node(8);

        Node l3 = new Node(3);
        l3.next = new Node(6);
        l3.next.next = new Node(9);

        Node[] lists = {l1, l2, l3};

        Node result = mergeK(lists, 0, lists.length - 1);

        printList(result);
    }
}