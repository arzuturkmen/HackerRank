package com.company;

import java.io.*;
import java.util.*;

public class LetsReview {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    int i=0;
    while (t>0) {

      String part1=scanner.next();
      String even="";
      String odd="";
      //first print even
      for(int j=0;j<part1.length();j++){
        if(j==0){
          even += part1.charAt(j);

        }
        else if((j%2)==0){
          even += part1.charAt(j);
        }
      }

      //first print odd
      for(int j=0;j<part1.length();j++){
        if((j%2)!=0){
          odd += part1.charAt(j);
        }
      }

      System.out.println(even+" "+odd);

      //second print odd

      t--;
    }


    //System.out.println("S: "+s);

    scanner.close();




  }
}


