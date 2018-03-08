/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class AILab2 {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) throws Exception 
    {
        String[] arr;
        // List<String> afc = Arrays.asList(arr);
        List<String> afc = new ArrayList<>();
        List<String> lTotal = new ArrayList<>();
        FileReader file = new FileReader("D:/travel.txt");
        BufferedReader reader = new BufferedReader(file);
        
       
       // String text = "";
       // String line = reader.readLine();
        
        
        for(String line = reader.readLine(); line != null; line = reader.readLine())
        {
            arr = line.split("\\s+");
            //System.out.println(line);
            //System.out.println(Arrays.toString(arr));
             
           // for loop here with combiing the list
            
            afc = Arrays.asList(arr);
            if (afc.get(2).contains("-1"))
            {
                System.out.println("Cant drive from " + afc.get(0) + " to city " + afc.get(1) + " there is a straight line distance of " + afc.get(3));
            }
            else
            {
                System.out.println("Travel from city " + afc.get(0) + " to city " + afc.get(1) + " with a stright line distance of " + afc.get(2) + " and an actual distance of " + afc.get(3));
            }
            
        }
        
        reader.close();
        
    }
        
        
       
        
}
