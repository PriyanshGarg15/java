package linked_list;
public class remove_duplicates_from_linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node remove(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        while (current.next!= null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node x1 = new Node(5);
        Node x2 = new Node(5);
        Node x3 = new Node(5);
        Node x4 = new Node(5);
        Node x5 = new Node(9);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;

        Node x = remove(x1);
        Node temp = x;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
