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
public class Dog extends Mammal{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a=new Mammal();
        Animal b=new Dog();
        Dog d=new Dog();
        System.out.println(a instanceof Animal);
        System.out.println(b instanceof Mammal);
        System.out.println(d instanceof Animal);
        
    }
    
}
