/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
public class AILab2 {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) throws Exception 
    {
        String[] arr;
        FileReader file = new FileReader("D:/travel.txt");
        BufferedReader reader = new BufferedReader(file);
        
       
       // String text = "";
        //String line = reader.readLine();
        
        
        for(String line = reader.readLine(); line != null; line = reader.readLine())
        {
            arr = line.split("\\s+");
            //System.out.println(line);
            //System.out.println(Arrays.toString(arr));
            
            List<String> afc = Arrays.asList(arr);
            System.out.println(afc);
            System.out.println("next line");
            
            
        }
//        while(line != null){
//        text += line + "\n";
//        line = reader.readLine();
//        String[] arr = text.split(" ");
        
        //System.out.println(Arrays.toString(arr));
        
    }
        
        //reader.close();
        //System.out.println(text);
        
}
    
//}
