package com.company;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Dictionaries{
  public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    Map<String,Number> phoneBook= new HashMap<String,Number>();

    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      phoneBook.put(name,phone);
      // Write code here
    }
    while(in.hasNext()){
      String s = in.next();
      if(phoneBook.get(s) != null){
        System.out.println(s+"="+phoneBook.get(s));
      }else{
        System.out.println("Not found");
      }
      // Write code here
    }
    in.close();
  }
}


