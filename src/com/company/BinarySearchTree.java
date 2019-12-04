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
class Solution{

  public static int getHeight(Node root){

    int leftH =0;
    int rightH =0;




    rightH = (1 +getHeightR(root.right));
    leftH = (1 +getHeightL(root.left));



    int max =-999;
    if(rightH > leftH )
    {
      max = rightH;

    }else{
      max = leftH;
    }

    return max;



  }

  public static int getHeightL(Node root){


    if(root.left == null && root.right == null){
      return 0;
    }



    int leftH = (1 +getHeight(root.left));

    return leftH;

  }

  public static int getHeightR(Node root){

    if(root.left == null && root.right == null){
      return 0;
    }


    int rightH = (1 +getHeight(root.right));

    return rightH;
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
    int height=getHeight(root);
    System.out.println(height);
  }
}