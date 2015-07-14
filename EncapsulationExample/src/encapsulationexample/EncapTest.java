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
public class EncapTest {
    private String name;
    private String idNum;
    private int age;
    
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
        
    }
    public String getIdNum(){
        return idNum;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setIdNum(String idNum){
        this.idNum=idNum;
        
    }
    public void setName(String name){
        this.name=name;
        
    }
    
}
