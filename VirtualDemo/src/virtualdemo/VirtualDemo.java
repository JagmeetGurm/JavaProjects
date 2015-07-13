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
public class VirtualDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Salary s=new Salary("jim", "123 Street Ca", 3456, 5000.0);
     //   Employee e=new Salary("JOhn", "345 Street, CA", 11, 4000.0);
        System.out.println("Call mailCheck using Salary reference ----");
        s.mailCheck();
        System.out.println("Call mailcheck using employee reference----");
       // e.mailCheck();
        
    }
    
}
