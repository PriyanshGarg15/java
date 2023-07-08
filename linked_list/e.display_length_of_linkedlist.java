package linked_list;
import java.util.*;
public class display_length_of_linkedlist
{
    public static int length(Node head)
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
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
        System.out.println(length(x1));       
    }
}
