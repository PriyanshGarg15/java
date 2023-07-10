package linked_list;
public class segragate_odd_even_in_linkedlist
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

    public static Node oddEvenList(Node head) 
    {
        if(head==null || head.next==null) return head;
        Node dummyEven=new Node(-1);
        Node dummyOdd=new Node(-1);
        Node evenTail=dummyEven;
        Node oddTail=dummyOdd;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data%2!=0)
            {
                oddTail.next=curr;
                oddTail=oddTail.next;
            }
            else
             {
                evenTail.next=curr;
                evenTail=evenTail.next;
            }
            curr=curr.next;
        }
        oddTail.next=dummyEven.next;
        evenTail.next=null;
        return dummyOdd.next;
    }     
     public static void main(String[] args) 
    {
        Node x1=new Node(5);
        Node x2=new Node(6);
        Node x3=new Node(7);
        Node x4=new Node(8); 
        Node x5=new Node(9);
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        Node x=oddEvenList(x1) ;
        Node temp=x;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
}

