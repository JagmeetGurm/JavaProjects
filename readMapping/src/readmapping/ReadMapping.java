/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readmapping;
import java.io.*;
/**
 *
 * @author Jagmeet
 */
public class ReadMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //reading file
        String fileName="C:\\Users\\Jagmeet\\Documents\\NetBeansProjects\\readMapping\\src\\readmapping\\test.fa";
        String line=null;
        
        try{
        FileReader fileReader= new FileReader(fileName);
        //wrap fileReader in BufferedReader
        BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
        
while((line=bufferedReader.readLine())!=null){
  //  if(line.substring(17,25)=="NR_046018"){
    String[] columns = line.split("\t");
     // System.out.println("my first column : "+ columns[0] );
      System.out.println("my second column : "+ columns[1] );
      String[] thirdColumn= columns[2].split(" ");
      System.out.println("third col: "+ thirdColumn[0]);
   // System.out.println(line);
  //  }
        }
bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
            
    }
    
}
