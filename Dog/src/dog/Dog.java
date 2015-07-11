/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Jagmeet
 */
public class Dog{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a=new Animal(); //Animal reference and object
        Animal b=new Mammal();  //Animal reference but Mammal object.
       // Dog d=new Dog();
     /*   System.out.println(a instanceof Animal);
        System.out.println(b instanceof Mammal);
        System.out.println(d instanceof Animal);
       */
        a.blood();//runs the method in Animal class
        b.blood(); //runs the method in Mammal class
        
      
    }
    
}
