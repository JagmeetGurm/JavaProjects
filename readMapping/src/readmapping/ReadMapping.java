/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readmapping;
import java.io.*;
import java.util.*;
/**
 *
 * @author Jagmeet
 */
public class ReadMapping {

    /**
     * @param args the command line arguments
     */
    public static void mapping(String geneId, gene g, Map<String, gene>sample, int rL, int rH){
        if(sample.isEmpty() && (g.startIndex>=rL && g.endIndex<=rH) ){
        sample.put(geneId, g);
        }
        else{
        
        if(sample.containsKey(geneId) && (g.startIndex>=rL && g.endIndex<=rH)){
        gene temp=sample.get(geneId);
        temp.count++;
      //  break;
        }
       else if(g.startIndex>=rL && g.endIndex<=rH){
       sample.put(geneId, g);
        }
        }
        
    }
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
        Map<String,gene>sample=new HashMap<String, gene>();
while((line=bufferedReader.readLine())!=null){
  //  if(line.substring(17,25)=="NR_046018"){
    String[] columns = line.split("\t");
     // System.out.println("my first column : "+ columns[0] );
   //   System.out.println("my second column : "+ columns[1] ); //col 1 is start index
      String[] thirdColumn= columns[2].split(" ");
    //  System.out.println("third col: "+ thirdColumn[0]); //end index
      //thirdcol[1] will be 
   // System.out.println(line);
  //  }
      int startInd=Integer.parseInt(columns[1]); //convert stirng to Int
      int endInd=Integer.parseInt(thirdColumn[0]); //convert string to Int
      gene g=new gene(startInd, endInd); //create gene object
      String geneID=thirdColumn[1]; //gene id extracted
      String range=geneID.substring(5);
      int pos=geneID.indexOf('N');
      int rangeLow=Integer.parseInt(range.substring(0, range.indexOf('.'))); //lwer range
      int rangeHigh= Integer.parseInt(range.substring((range.indexOf('.'))+1, pos-6));
      int lastPos=geneID.lastIndexOf('.')-2;
      String gID=geneID.substring(pos,lastPos );
     // System.out.println(rangeHigh);
    //  sample.put(geneID, g);
      mapping(gID, g, sample, rangeLow, rangeHigh);
        }

for ( Map.Entry<String, gene> entry : sample.entrySet()) {
    String key = entry.getKey();
    gene tab = entry.getValue();
    // do something with key and/or tab
    System.out.println("key: "+ key + "   count: "+ tab.count);
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
