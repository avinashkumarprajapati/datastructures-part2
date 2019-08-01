/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.basic;

/**
 *
 * @author AVINASH KUMAR
 */
public class HanoiTower {
  static int nDisks = 2;

  public static void main(String[] args) {
    hanoiTower(nDisks, 'A', 'B', 'C');
  }

  public static void hanoiTower(int topN, char src, char inter, char dest) {
    if (topN == 1)
      System.out.println("Disk "+ topN + " from " + src + " to " + dest);
    else {
      // src to inter
      hanoiTower(topN - 1, src, dest, inter);
      // move bottom
      System.out.println("Disk " + topN + " from " + src + " to " + dest);
      //inter to dest
      hanoiTower(topN - 1, inter, src, dest);
    }
  }
}