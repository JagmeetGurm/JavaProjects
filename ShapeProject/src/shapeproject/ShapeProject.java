/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.io.*;
package shapeproject;
import java.util.*;

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
         r[0]=new Rect(1,2);
        System.out.println(r[1].checkValidity());
        System.out.println(r[1].getArea());
        System.out.println("change the length of rect r1: ");
       r[1].setSides(3.0, 6.0);
       r[0].setSides(4, 5);
       for(int i=0; i<2; i++){
      System.out.println("Side1: "+r[i].getSide1());
      System.out.println("Side2: "+r[i].getSide2());
      System.out.println("New Area of rect: "+r[i].getArea());
       }
       //checked all the functions
     //Traingle
      Vector <Triangle>tri=new Vector();
      Triangle t1=new Triangle(4, 6, 3);
      Triangle t2=new Triangle(3,2,9);
      System.out.println(t1.checkValidity());
      
      
     
      tri.add(t1);
      tri.add(t2);
      System.out.println("This is the test for 1st element of triangle: "+tri.elementAt(0).checkValidity());
      System.out.println(tri.firstElement().getArea());
    //System.out.println((Triangle)tri.firstElement().checkValidity()); 
      System.out.println("cheking 2nd triangle: "+tri.elementAt(1).checkValidity());
      
        
    }
    
}
