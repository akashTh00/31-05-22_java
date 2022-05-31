import java.io.*;
import java.util.*;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       LinkedList list = new LinkedList();
       int num = sc.nextInt();
       for ( int i=0; i<num; i++){
           list.push(sc.nextInt());
       }
       list.printList();
    }
}