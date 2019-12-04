package com.company;

import java.util.*;

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  // Constructor
  Person(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }

  // Print person data
  public void printPerson(){
    System.out.println(
        "Name: " + lastName + ", " + firstName
            + 	"\nID: " + idNumber);
  }

}

class Student extends Person{
  private int[] testScores;

  /*
   *   Class Constructor
   *
   *   @param firstName - A string denoting the Person's first name.
   *   @param lastName - A string denoting the Person's last name.
   *   @param id - An integer denoting the Person's ID number.
   *   @param scores - An array of integers denoting the Person's test scores.
   */

  public Student(String firstName,String lastName,int id,int[] scores){
    super(firstName,lastName,id);
    testScores = scores;

  }
  // Write your constructor here

  /*
   *   Method Name: calculate
   *   @return A character denoting the grade.
   */

  public char calculate(){

    int n = testScores.length;
    int sum=0;
    for(int i=0;i<n;i++){
      sum += testScores[i];
    }

    int grade = sum / n;

    if(grade >= 90 && grade <= 100){
      return 'O';
    }else if(grade >=80 && grade <90){
      return 'E';
    }else if(grade >=70 && grade <80){
      return 'A';
    }else if(grade >=55 && grade < 70){
      return 'P';
    }else if(grade >=40 && grade < 55){
      return 'D';
    } else if(grade < 40){
      return 'T';
    }else {
      return '.';
    }

  }
  // Write your method here
}



