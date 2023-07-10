package linked_list;
public class reverse_linked_list {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node rev(Node head) {
        if (head == null || head.next == null) 
        {
            return head;
        }
        Node prev=null;
        Node curr=head;
        while (curr!= null) 
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node x1 = new Node(5);
        Node x2 = new Node(6);
        Node x3 = new Node(7);
        Node x4 = new Node(8);
        Node x5 = new Node(9);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;

        Node x = rev(x1);
        Node temp = x;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
