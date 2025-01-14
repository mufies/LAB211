/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearSearch {
   private int a[];

    public LinearSearch(int x) {
        this.a = new int[x];
    }

   
   
   public void addValue(int x,int y)
   {
       System.out.print("The array: [ ");
       int pos=-1;
       for(int i=0;i<x;i++)
       {
           a[i] = (int)(Math.random() * 10);
           if(a[i]==y)
               pos=i;
           if(i!=x-1)
           System.out.print(a[i]+", ");
           else
               System.out.print(a[i]);
       }
       System.out.println(" ]");
       System.out.println("Found at "+y+" at index: "+pos);
       
       
   }
}
