/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
package shapeproject;
//import shapeproject.Shape;

/**
 *
 * @author Jagmeet
 */
public class ShapeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rect[] r=new Rect[9];
         r[1]=new Rect(4.0, 6.0);
        System.out.println(r[1].checkValidity());
        System.out.println(r[1].getArea());
        System.out.println("change the length of rect r1: ");
       r[1].setSides(3.0, 6.0);
      System.out.println("Side1: "+r[1].getSide1());
      System.out.println("Side2: "+r[1].getSide2());
      System.out.println("New Area of rect: "+r[1].getArea());
      
       
        
        
    }
    
}
