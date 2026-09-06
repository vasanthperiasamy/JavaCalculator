package com.myproj.calculate;

public class Calculator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Addition: " + add(5, 5));
    System.out.println("Multiply: " + multiply(5, 5));
  }

  // comment added to simulate pull
  public static int add(int a, int b) {
    return a + b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }
}
