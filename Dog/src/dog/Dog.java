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
 interface Vegeterian{}
class Deer extends Animal implements Vegeterian{}
public class Dog{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a=new Animal(); //Animal reference and object
        Mammal b=new Mammal();  //Animal reference but Mammal object.
        //^^If this is changed to Animal type, it wont be able to call the birth method because b's reference type Animal doesn't have bark method.
       // Dog d=new Dog();
     /*   System.out.println(a instanceof Animal);
        System.out.println(b instanceof Mammal);
        System.out.println(d instanceof Animal);
       */
        a.blood();//runs the method in Animal class
        b.blood(); //runs the method in Mammal class
        b.birth();
        Deer d=new Deer();
        Animal a1=d;// all refer to same d(Deer)
       Vegeterian m=d;
        
       Object o=d;
       System.out.println(d instanceof Animal);
        
        
      
    }
    
}
