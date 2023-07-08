package linked_list;
import java.util.*;
public class deletion_in_linked_list
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
    public static void delete(Node head,int pos)
    {
        if(pos==0)
        {
            head=head.next;
            return;
        }
        Node prev=head;
        for(int i=0;i<pos-1;i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
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
        delete(x1,1) ;
        Node temp=x1;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }    
    }
}
