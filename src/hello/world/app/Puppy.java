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
//non public class(Test)
//it can start with lower case
class test{
   
    public void puppyAge(){
        //variable initialiaztion required for local variable(age)
        int age=0;
        age=age+5;
        System.out.println("puppy age is: "+ age);
    }
}
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
        
        //for 2nd class
        System.out.println("\n 2nd dog's age: ");
        //creating an instance of test class
        test pup2=new test();
        //calling the member function of test class
        pup2.puppyAge(); 
        
        
    }
}
