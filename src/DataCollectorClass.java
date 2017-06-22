
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexey Titov alexeytitovwork@gmail.com
 * @since 14.04.2017
 */
public class DataCollectorClass {
    /**
     * Internal container
     */
    public List<String> collection;
     
    
    public DataCollectorClass(){
        collection = new ArrayList<>();  
    }
    /**
    * Internal method ...
    */
    public void nounCollector(String[] tokens) {
         for(String element : tokens){
              //System.out.println( element + " " );
              if(element.equals("n")){ // true
                  collection.add(tokens[1]);
              }
         }
    }  
    /**
    * Internal method ...
    * return noun collected box
    */
    public List<String> getCollection() {
         return collection;
    }  
}
