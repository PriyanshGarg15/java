package linked_list;
public class odd_even_position_linkedlist
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
       Node odd=new Node(0);
       Node even=new Node(0);
       Node tempo=odd;
       Node tempe=even;
       Node temp=head;
       while(temp!=null)
       {
        tempo.next=temp;
        temp=temp.next;
        tempo=tempo.next;
        tempe.next=temp;
        if(temp==null) break;
        temp=temp.next;
        tempe=tempe.next;
       }
       odd=odd.next;
       even=even.next;
       tempo.next=even;
       return head;


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

