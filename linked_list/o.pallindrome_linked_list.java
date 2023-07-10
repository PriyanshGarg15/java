package linked_list;
public class pallindrome_linked_list
{
    public static class Node 
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node mid(Node head)
    {
        if(head==null || head.next==null) return head;
        Node slow=head;;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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

    public static boolean pallindrome(Node head )
    {
        if (head == null || head.next == null) 
        {
            return true;
        }
        Node mi=mid(head);
        Node n=mi.next;
        mi.next=null;
        n=rev(n);
        Node c1=head;
        Node c2=n;
        boolean res=true;
        while(c2!=null)
        {
            if(c1.data!=c2.data)
            {
                res=false;
                break;
            }
            c1=c1.next;
            c2=c2.next;
        }
        n=rev(n);
        mi.next=n;
        return res;
    }

    public static void main(String[] args) 
    {
        Node x1=new Node(1);
        Node x2=new Node(0);
        Node x3=new Node(0);
        x1.next=x2;
        x2.next=x3;
        boolean x=pallindrome(x1);
        System.out.println(x);       
    }
}
