//nth node from last=(m-n+1) from satrt ==>from a.p formula
package linked_list;
import java.util.*;
public class display_nth_node_from_end_using_turtle_rabbit_algo
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
    public static Node delete(Node head,int pos)
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=pos;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
            
        }
        return slow;
        
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
        Node x=delete(x1,3) ;
        System.out.println(x.data);
        
    }
}
