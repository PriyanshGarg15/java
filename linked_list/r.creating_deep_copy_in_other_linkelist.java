package linked_list;
public class creating_deep_copy_in_other_linkelist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deep(Node head) 
    {
        Node h=new Node(0);
        Node temp=head;
        Node temp2=h;
        while(temp!=null)
        {
            Node m=new Node(temp.data);
            temp2.next=m;   
            temp = temp.next;
            temp2 = temp2.next;
        }
        h=h.next;
        return h;
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

        Node x = deep(x1);
        Node temp = x;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
