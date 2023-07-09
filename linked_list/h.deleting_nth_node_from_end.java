//nth node from last=(m-n+1) from satrt ==>from a.p formula
package linked_list;
import java.util.*;
public class deleting_nth_node_from_end
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
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }    
        int a=count-pos+1;
        System.out.println(a);
        temp=head;
        for(int i=1;i<a;i++)
        {
            temp=temp.next;
        }
        return temp;
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
        Node x=delete(x1,5) ;
        System.out.println(x.data);
        
    }
}
