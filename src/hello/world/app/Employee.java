/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app;

/**
 *
 * @author Jagmeet
 */
import java.io.*;
class Employ{
    //this public varible will also be accessible to subclasses.
    public String name;
    //this variable will only be available to class methods.
    private double salary;
    public Employ(String name){
        this.name=name;
    }
    public void setSalary(double empSal){
        salary=empSal;
    }
    public void printEmp(){
        System.out.println("name: "+ name);
        System.out.println("salary: "+salary);
    }
}
public class Employee {
    String name;
    int age;
    double salary;
    String designation;
    
    public Employee(String name){
        this.name=name;
        
    }
    public void empAge(int ag){
        age=ag;
        
    }
    public void empDesign(String design){
        this.designation=design;
    }
    public void empSalary(double sal){
        salary=sal;
    }
    public void print(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
        System.out.println("des: "+designation);
    }

public static void main(String args[]){
Employ emp1=new Employ("Jag");
emp1.setSalary(1000);
emp1.printEmp();
Test2 ternaryTest=new Test2(30);


Vehicle car1=new Car();
boolean result=car1 instanceof Car;
//should return true;
System.out.println(result);
result=car1 instanceof Vehicle;
//should return true;
System.out.println(result);
}
}
//non-public class 
class Test2{
    private int a=10;
    public Test2(int num){
        int b=(a==num)? 5: 20;
        System.out.println("b is: " +b);
        
    }
}
//Abstract class(non-public)
class Vehicle{
}

//Derived Class(non-public)
class Car extends Vehicle{
}   
