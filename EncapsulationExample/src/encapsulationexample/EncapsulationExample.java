/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationexample;

/**
 *
 * @author Jagmeet
 */
public class EncapsulationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EncapTest e=new EncapTest();
        e.setAge(25);
        e.setIdNum("01e");
        e.setName("jim");
        System.out.println("Name: "+e.getName()+"\n Id: "+ e.getIdNum()+"\n Age: "+e.getAge());
        
    }
    
}
