package linked_list;
public class max_twin_sum
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

    public static int twin(Node head )
    {
        int maxsum=0;
        Node mi=mid(head);
        Node n=mi.next;
        mi.next=null;
        n=rev(n);
        Node c1=head;
        Node c2=n;
        while(c2!=null)
        {
            int sum=c1.data+c2.data;
            if(maxsum<sum)
            {
                maxsum=sum;
            }
            c1=c1.next;
            c2=c2.next;
        }
        return maxsum;
       
    }

    public static void main(String[] args) 
    {
        Node x1=new Node(6);
        Node x2=new Node(7);
        Node x3=new Node(100);
        Node x4=new Node(9);
        Node x5=new Node(10);
        Node x6=new Node(11);
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        x5.next=x6;
        int x=twin(x1);
        System.out.println(x);      
    }
}
