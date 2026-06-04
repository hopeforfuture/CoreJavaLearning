/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class Swap {
  public int i,j;
  public Swap(int i, int j) {
      this.i = i;
      this.j = j;
  }

  public void makeSwap(Swap s) {
      int temp;
      temp = s.i;
      s.i  = s.j;
      s.j  = temp;
  }  
}
public class SwapDemo {
    public static void main(String[] args) {
        Swap s1 = new Swap(5, 6);
        System.out.println("Before swap:");
        System.out.println("i and j " + s1.i + " " + s1.j);
        s1.makeSwap(s1);
        System.out.println("After swap:");
        System.out.println("i and j " + s1.i + " " + s1.j);
    }
}
