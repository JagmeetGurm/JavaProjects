/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeproject;

/**
 *
 * @author Jagmeet
 */
public class Rect extends Shape{
    
    //applying polymorphism
    private double length, width;
    
    //constructor initializing the member variables
    public Rect(double s1, double s2){
        length=s1;
        width=s2;
    }
    //set method to set values of private variables
  public  void setSides(double side1, double side2){
        length=side1;
        width=side2;
        
    }
  //get methods to return the two sides of rectangle
    public double getSide1(){
        return length;
    }
    public double getSide2(){
        return width;
    }
    
    public boolean checkValidity(){
        return(length>0 && width> 0);
            
    }
    public double getArea(){
        return length*width;
    }
}