// The height of a binary tree is the number of edges between the tree's root and its furthest leaf. For example, the following binary tree is of height :

import java.io.*;
import java.util.*;

public class BinarySearchTree {
    class Node{
        int key;
        Node left , right;
        
        public Node(int item){
            key = item;
            left = right = null;
        }
    }
    static Node root;
    
    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int value){
        root = new Node(value);
    }
    
    void insert(int key){
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if( key < root.key){
            root.left = insertRec(root.left, key);
        }
        else if( key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    public static int getHeight(Node root){
        int heightLeft = 0;
        int heightRight = 0;
        if(root.left != null){
            heightLeft = getHeight(root.left) + 1;
            
        }
        if(root.right != null){
            heightRight = getHeight(root.right) + 1;
        }
        return (heightLeft > heightRight? heightLeft: heightRight);
    }
    
    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();
       Scanner sc = new Scanner(System.in);
       int nn = sc.nextInt();
       for(int i=0; i< nn; i++){
          tree.insert(sc.nextInt()); 
       }
       int height = getHeight(root);
       System.out.println(height);  
    }
}