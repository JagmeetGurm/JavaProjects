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
public class EmployeeTest {
    public static void main(String [] args){
        Employee emp1=new Employee("jag");
        Employee emp2=new Employee("har");
        // Invoking methods for each object created
      emp1.empAge(26);
      emp1.empDesign("Senior Software Engineer");
      emp1.empSalary(1000);
      emp1.print();

      emp2.empAge(21);
      emp2.empDesign("Software Engineer");
      emp2.empSalary(500);
      emp2.print();
    }
}
