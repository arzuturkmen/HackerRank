package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArrays {



  private static final Scanner scanner = new Scanner(System.in);


  private static int sumArr(int x, int y,int[][] arrNew){

    int midX=0;
    int midY=0;

    int sum=0;
    midX = x+1;
    midY = y+1;
    //first

    int count=0;
    for(int i= x;i<x+3;i++){

      for(int j = y;j<y+3;j++){

        if(count == 1){ // if middle
          sum += arrNew[midX][midY];
          break;
        }else{
          sum += arrNew[i][j];
        }


      }
      count++;

    }


    return sum;

  }
  public static void main(String[] args) {
    int[][] arr = new int[6][6];
    int[] sumOfArr = new int [16];



    for (int i = 0; i < 6; i++) {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 6; j++) {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }


    int index =0;
    int max=-100;

    for(int i=0;i<4;i++){

      for(int j=0;j<4;j++){

        sumOfArr[index] = sumArr(i,j,arr);
        if( sumOfArr[index] > max){
          max= sumOfArr[index];
        }
        index++;

      }


    }
    System.out.println(max);


    scanner.close();
  }
}


