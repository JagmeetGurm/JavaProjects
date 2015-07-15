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
public class Triangle {
    private double a, b, c;
    public Triangle(double s1,double s2, double s3){
        a=s1;
        b=s2;
        c=s3;
    }
    public void set(double newA, double newB,double newC){
        a=newA;
        b=newB;
        c=newC;
        
    }
    public double getSide1(){
        return a;
    }
    public double getSide2(){
        return b;
    }
    public double getSide3(){
        return c;
    }
    public boolean checkValidity(){
        if(a!=0 && b!=0 && c!=0){
        return((a+b>=c) || ((b+c)>=a) || ((a+c)>=b));
            
        }
        return false;
        }
    public double getArea(){
            double s=(a+b+c)/2;
            return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }
}

