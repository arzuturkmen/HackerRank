package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumber {

  public static String convertDecToBinary(int n)
  {
    int remainder = n%2;
    int division, resultInt;
    String result = String.valueOf(remainder);
    division = n/2;
    while(division>0)
    {
      remainder = division%2;
      result = String.valueOf(remainder) + result;
      division = division/2;
      if(division == 0)
        break;
    }
    return result;
  }

  public static void maxNumOfOnes(int s)
  {
    String binaryString = convertDecToBinary(s);

    int max = 0;
    int counter = 0;
    int len = binaryString.length();
    for(int i = 0 ; i < len; i++)
    {
      Character c = binaryString.charAt(i);
      if(c == '1')
      {
        counter++;
      }
      else if(c == '0' )
      {
        counter = 0;
      }
      if(counter > max)
        max = counter;
    }
    System.out.println(max);
  }


  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    maxNumOfOnes(n);
    scanner.close();
  }
}

