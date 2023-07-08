package linked_list;
import java.util.*;
public class displaying_linked_list
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
        Node temp=x1;
        System.out.println(temp.next);
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

        
    }
}
