package com.company;

import java.io.*;
import java.util.*;

public class RunningTimeComplexity {


  public static void isPrime(int n){


    int middle = n/2;


    if(n == 1){

      System.out.println("Not prime");
      return;
    }else if(n == 2){

      System.out.println("Prime");
      return;

    }

    if(n >2){
      Boolean prime = true;
      for(int i=2;i<=middle;i++){

        if((n%i) == 0){
          prime = false;
          break;
        }

      }
      if(!prime){
        System.out.println("Not prime");
      }else{
        System.out.println("Prime");
      }
    }


  }


  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner sc = new Scanner(System.in);

    int T=sc.nextInt();
    while(T-->0){
      int ele=sc.nextInt();
      isPrime(ele);
    }
  }
}


