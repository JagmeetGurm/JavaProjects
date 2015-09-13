/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;
//import java.util.*;
import java.io.*;
/**
 *
 * @author Jagmeet
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=512;
        int sum=0;
        while(num!=0){ //running loop time num is not 0
            sum+=(num%10); //with each loop taking mod of num
            num=num/10;  //divide num by 10 for each loop
        }
        System.out.println(sum);  //printing out the output
        
        
        //program to print odd numbers between 1 and 99
        int i=1; //initialized i
        while(i<100) //while loop
        {
            System.out.println(i); //print i
            i+=2; //incrementing by 2 
        }
        
    //program to calculate modulus of a number without using %
        int n=14;  //initialized dividend
        int m=3;  //initialized divisor
        while(n>=m){   //repeated subtraction till divisor is >= to dividend
            n-=m; //decremental subtraction
        }
        System.out.println("Modulus program: "); //printing output
        System.out.println(n);
        
    }
    
}
