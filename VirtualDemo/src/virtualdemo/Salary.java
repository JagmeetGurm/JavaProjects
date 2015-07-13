/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualdemo;

/**
 *
 * @author Jagmeet
 */
public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary){
      super(name, address, number);
      setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Within mailCheck of Salary Class");
        System.out.println("Mailing Check to: "+ getName()+"with salary: "+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary>=0)
            salary=newSalary;
    }
    public double computePay(){
        System.out.println("Computing salary pay for: "+ getName());
        return salary/52;
    }
}
