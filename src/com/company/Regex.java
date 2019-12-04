package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Regex {


  private static void SortAlpabetically(ArrayList<String> arr){

    Collections.sort(arr);

    for(String aa : arr)
      System.out.println(aa);

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String emails="";
    for (int NItr = 0; NItr < N; NItr++) {
      String[] firstNameEmailID = scanner.nextLine().split(" ");

      String firstName = firstNameEmailID[0];

      String emailID = firstNameEmailID[1];

      emails +=firstName +" "+ emailID +".";
    }

    //remove dublicate emails

    Pattern dupPattern = Pattern.compile("([ \\w]+)\\@gmail.com", Pattern.CASE_INSENSITIVE);
    Matcher matcher = dupPattern.matcher(emails);

    ArrayList<String> arr = new ArrayList<String>();

    while(matcher.find()){
      arr.add( matcher.group().split("@")[0].split(" ")[0]);
    }

    SortAlpabetically(arr);
    scanner.close();
  }
}

