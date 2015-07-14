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
public abstract class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number){
        System.out.println("Constructing Employee");
        this. name=name;
        this.number=number;
        this.address=address;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to: "+ this. name+ " "+ this.address);
        
        
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address=newAddress;
    }
    public int getNumber(){
        return number;
    }
    public String toString(){
        return name+" "+address+" "+number;
    }
    public abstract double computePay();
}
