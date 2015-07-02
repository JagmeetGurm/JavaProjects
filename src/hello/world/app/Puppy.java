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
public class Puppy {
    int puppyAge;
    
    
    public Puppy(String name){
        System.out.println("Dog's name is :"+ name);
    }
    public void setAge(int age){
        puppyAge=age;
        
    }
    public int getAge(){
        System.out.println("puppy's age is :"+puppyAge);
        return puppyAge;
    }
    
    public static void main(String [] args){
        //object creation
        Puppy myPuppy=new Puppy("Brozo");
        myPuppy.setAge(4);
        myPuppy.getAge();
        
        //accessing instance variable
        System.out.println("my dog's age is : "+myPuppy.puppyAge);
        
        
    }
}
