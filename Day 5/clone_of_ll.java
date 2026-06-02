

class Node {
    int data;
    Node next, random;

    Node(int data) {
        this.data = data;
        next = random = null;
    }
}

public class clone_of_ll {

    static Node cloneList(Node head) {

        if (head == null)
            return null;

        Node curr = head;

        
        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

       
        curr = head;

        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;

            curr = curr.next.next;
        }

        
        curr = head;
        Node cloneHead = head.next;

        while (curr != null) {
            Node copy = curr.next;

            curr.next = copy.next;

            if (copy.next != null)
                copy.next = copy.next.next;

            curr = curr.next;
        }

        return cloneHead;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.random = head.next.next; 
        head.next.random = head;      
        head.next.next.random = head.next; 

        Node clone = cloneList(head);

        System.out.println("Cloned List Created");
    }
}