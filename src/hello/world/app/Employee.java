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
}
