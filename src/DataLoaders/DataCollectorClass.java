package DataLoaders;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Help class for CorpusDataClass.java
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
     * @param tokens
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
     * @return 
    */
    public List<String> getCollection() {
         return collection;
    }  
    
    /**
     * Use different input file and format it content to Nimbler Data Format (.NDF) to load in data base.
     * input file "ProductsFood_1.txt"
     * 
     * @param fileNameInResources "ProductsFood_1.txt" in ...\nimbler-corpus\build\test\classes\META-INF\resources\
     * @throws java.io.FileNotFoundException
     */
    public void NimblerDBFormatMaker(String fileNameInResources) throws FileNotFoundException, URISyntaxException{
        
        
        /**
         *  fileNameInResources  = "ProductsFood.txt"
         */
        URL resource = getClass().getClassLoader().getResource("META-INF/resources/" + fileNameInResources);
        System.out.println("URL " + resource);
        /**
         * Use a scanner to read in the data line by line
         */
        Scanner s = new Scanner(new File(resource.toURI())); // throws FileNotFoundException, URISyntaxException
        List<String> products = new ArrayList<>();
        List<String> category = new ArrayList<>();
        List<String> subcategory = new ArrayList<>();


        int lineNumber = 0;
        while (s.hasNextLine()) {
            String next = s.nextLine();
            next = next.toLowerCase();
            /**
             * Print all of resource data
             */
            //System.out.println(next);
            lineNumber++;
            /**
             * Parse the line into an array
             */
            String[] token = next.split("_");
            boolean add = false;
              //System.out.println( element + " " );
            if(token[0].equals("category") && token.length > 1 ){ // true
                  add = category.add(token[1]);
                //System.out.println(add);
            }else (token[0].equals("subcategory") && token.length > 1 ){ // true
        }
            else if(token[0].equals("meat") && token.length < 2)
            {  
                /**
                * Add some new category from parsing text
                */
                add = category.add(next);
            }else if(token[0].equals("fish") && token.length < 2)
            {
                /**
                * Add some new category from parsing text
                */
                add = category.add(next);
            }else if(token[0].equals("vegatables") && token.length < 2)
            {
                /**
                * Add some new category from parsing text
                */
                add = category.add(next);
            }else if(token[0].equals("fruit"))
            {
                /**
                * Add some new category from parsing text
                */
                add = category.add(next);
            }else if( token[0].equals("berries") && token.length < 2)
            {
                /**
                * Add some new category from parsing text
                */
                add = category.add(next);
            }else if(token[0].equals("nuts") && token.length < 2)
            {
                /**
                * Add some new category from parsing text
                */
                add = category.add(next);
            }

            if(token.length > 1) 
            {
                /**
                * Add some new category from parsing text
                */
                add = products.add(token[0] + "_"+ category.get(category.size() -1) );
            }
        }

        System.out.println("\nThis list contains most popular category and producs form food store");
        System.out.println("Remember this is only firs variant of product list.\n");

        List<Double> testResult = new ArrayList<>();
        String fileData = "newProduct.dat";
        String dir = CorpusDataClass.class.getResource("/Meta-inf/resources/").getFile();
        OutputStream os = new FileOutputStream(dir + fileData);
        try (PrintStream printStream = new PrintStream(os)) {
              products.stream().forEach((element) -> {
                  /**
                   * Print only noun form resource data
                   */
                  //  System.out.println(element);
                  printStream.println(element);
            });
          }   

            
    } 
    
}
