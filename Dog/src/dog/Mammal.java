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
 class Mammal extends Animal{
     public void blood(){
         super.blood();
         System.out.println("Mammals are hot-blodded animals");
     }
     public void birth(){
         System.out.println("Mammmals give birth to babies");
     }
    
}
