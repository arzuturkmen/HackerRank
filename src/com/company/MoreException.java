package com.company;

import java.util.*;
import java.io.*;

//Write your code here

class Calculator{

  int power(int n,int p)  throws Exception{

    if(n <0 || p <0){
      throw new Exception("n and p should be non-negative");
    }

    int temp = n;
    int result;

    if(n == 0){
      return 0;
    } if(p == 0){
      return 1;
    }

    while(--p > 0 && n!= 0 && p != 0){
      temp= temp*n;
    }

    return temp;


  }



}

class Solution{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t-- > 0) {

      int n = in.nextInt();
      int p = in.nextInt();
      Calculator myCalculator = new Calculator();
      try {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);
      }
      catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    in.close();
  }
}

