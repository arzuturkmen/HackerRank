package com.company;

import java.util.*;
import java.io.*;
class Node{
  Node left,right;
  int data;
  Node(int data){
    this.data=data;
    left=right=null;
  }
}
class BSTLevelOrderTraversal{


  static void levelOrder(Node root){
    Queue<Node> queue = new LinkedList();
    queue.add(root);

    while(!queue.isEmpty()){
      Node current = queue.remove();
      System.out.print(current.data+" ");
      if (current.left!=null) queue.add(current.left);
      if (current.right!=null) queue.add(current.right);
    }
  }


  static void levelOrderDD(Node root){
    //Write your code here


    if(root != null){
      System.out.print(root.data+" ");
    }
    Node rootL = root.left;
    Node rootR = root.right;

    while(root != null){


      if(rootL.right != null && rootL.left == null){
        rootL= rootL.right;
        System.out.print(rootL.data+" ");
      }
      else  if(rootL.left != null && rootL.right == null){
        rootL=rootL.left;
        System.out.print(rootL.data+" ");

      }
      else if(rootL.right != null && rootL.left != null){
        Node rootMM=rootL;
        rootL=rootR.left;
        System.out.print(rootL.data+" ");

        rootL=rootMM;
        rootL= rootL.right;
        System.out.print(rootL.data+" ");

      }



// for right part of tree
      if(rootR.left != null && rootR.right == null){
        rootR=rootR.left;
        System.out.print(rootR.data+" ");

      }
      else if(rootR.right != null && rootR.left == null){
        rootR= rootR.right;
        System.out.print(rootR.data+" ");
      }

      else if(rootR.right != null && rootR.left != null){
        Node rootM=rootR;
        rootR=rootR.left;
        System.out.print(rootR.data+" ");

        rootR=rootM;
        rootR= rootR.right;
        System.out.print(rootR.data+" ");

      }



    }


  }

  public static Node insert(Node root,int data){
    if(root==null){
      return new Node(data);
    }
    else{
      Node cur;
      if(data<=root.data){
        cur=insert(root.left,data);
        root.left=cur;
      }
      else{
        cur=insert(root.right,data);
        root.right=cur;
      }
      return root;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Node root=null;
    while(T-->0){
      int data=sc.nextInt();
      root=insert(root,data);
    }
    levelOrder(root);
  }
}
