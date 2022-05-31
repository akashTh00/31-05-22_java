//Given the root node of a binary tree, can you determine if it's also a binary search tree?

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
    static boolean isBST(Node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.left.key > root.key){
            return false;
        }
        if(root.right != null && root.right.key < root.key){
            return false;
        }
        if(!isBST(root.left) || !isBST(root.right)){
            return false;
        }
        return true;
    }
   
    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();
       Scanner sc = new Scanner(System.in);
       int nn = sc.nextInt();
       
        tree.insert(sc.nextInt());
        if(isBST(root) == true){
          System.out.print("Yes");
        }
        if(isBST(root) == false){
            System.out.print("No");
        }
        
       
    }
}