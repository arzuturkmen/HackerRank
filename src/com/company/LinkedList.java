package com.company;

import java.io.*;
import java.util.*;

class Node {
  int data;
  Node next;
  Node(int d) {
    data = d;
    next = null;
  }
}

class LinkedList {

  public static  Node insert(Node head,int data) {

    //System.out.println(head + " " + data);
    Node node = new Node(data);
    Node current = head;

    if(head == null){
      current = node;

    }
    else{


      while(current.next != null){
        current = current.next;
      }
      current.next = node;
      current = head;

    }


    return current;

  }

  public static void display(Node head) {
    Node start = head;
    while(start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while(N-- > 0) {
      int ele = sc.nextInt();
      head = insert(head,ele);
    }
    display(head);
    sc.close();
  }
}
