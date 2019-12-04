package com.company;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Scope {
  private int[] elements;
  public int maximumDifference;

  public Scope(int[] eS){
    this.elements = eS;
  }

  public void computeDifference(){

    maximumDifference =0;
    for(int i=0;i<this.elements.length;i++){

      for(int j=i+1;j<this.elements.length;j++){

        int difference = elements[i]-elements[j];
        if(Math.abs(difference) > maximumDifference){
          maximumDifference = Math.abs(difference);
        }

      }
    }


  }

  // Add your code here

} // End of Difference class




// Add your code here


