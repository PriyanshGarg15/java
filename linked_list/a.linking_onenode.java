package linked_list;
import java.util.*;
public class one
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
        System.out.println(x1.data);
        System.out.println(x2.data);
        System.out.println(x3.data);
        System.out.println(x4.data);
        System.out.println(x5.data); 
        x1.next=x2;
        System.out.println(x1.next);
        System.out.println(x2);
        
    }
}
