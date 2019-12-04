package com.company;

import java.io.*;
import java.util.*;

public class NestedLogic {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner actual = new Scanner(System.in);
    Scanner expected = new Scanner(System.in);

    int da=0;
    int ma=0;
    int ya=0;

    int de=0;
    int me=0;
    int ye=0;

    int i=0;

    while(i <6){

//actual
      if(i== 0)
        da = actual.nextInt();
      else if(i ==1)
        ma = actual.nextInt();
      else if(i== 2)
        ya = actual.nextInt();
//expected
      else if(i== 3)
        de = actual.nextInt();
      else if(i ==4)
        me = actual.nextInt();
      else if(i== 5)
        ye = actual.nextInt();

      i++;
    }


//calculation of  fine library


    if((ya < ye) || (ya == ye && ma < me ) || (ya == ye && ma == me && da<=de)) {
      System.out.println(0);
    }
    else if(ya==ye && ma==me && da >de){
      System.out.println(15 * (da-de));

    }
    else if(ya==ye && ma>me){
      System.out.println(500*(ma-me));

    }
    else if(ya>ye){
      System.out.println(10000);
    }

  }
}


