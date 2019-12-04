package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionClass {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();

    try{
      int val = Integer.parseInt(S);
      System.out.println(val);
    }
    catch(Exception ex){
      System.out.println("Bad String");
    }
  }
}



