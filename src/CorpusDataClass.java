
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


/*
 * Copyright 2017 Alex Titov. All rights reserved.
 * Use is subject to license terms.
 *
 * Software Code is protected by Copyrights. Author hereby reserves all rights
 * in and to Copyrights and no license is granted under Copyrights in this
 * Software License Agreement.
 *
 * Alex Titov generally licenses Copyrights for commercialization pursuant to
 * the terms of either a Standard Software Source Code License Agreement or a
 * Standard Product License Agreement. A copy of either Agreement can be
 * obtained upon request from: alexeytitovwork@gmail.com
/**
 *
 * @author Alex Titov  alexeytitovwork@gmail.com
 */
public class CorpusDataClass {
  /**
   * Internal method to read in the test method data include Lemma elements and part of speach value.
   * This method contains what we believe is the most accurate frequency data of English,
   * and it comes in a number of different formats.
   *
   * @return a mapped collection of test profile.
   * @throws FileNotFoundException
   * @throws URISyntaxException
   */
  private List<String> nounOnly;
  private final String fileName; //FiltredEntiresToDataBase.txt

    CorpusDataClass(String fileName){
    this.fileName = fileName;
    }
  
  
  public void readDataLemmaPosFormat() throws FileNotFoundException, URISyntaxException {
    URL resource = getClass().getClassLoader().getResource("META-INF/resources/" + this.fileName);
    System.out.println("URL " + resource);
    /**
     * Use a scanner to read in the data line by line
     */
    Scanner s = new Scanner(new File(resource.toURI())); // throws FileNotFoundException, URISyntaxException
    List<String> noun = new ArrayList<>();  
    this.nounOnly = new ArrayList<>();  
    List<String> verb = new ArrayList<>();  
    Integer NounCounter = 0;
    Integer VerbCounter = 0;
    DataCollectorClass NounBox = new DataCollectorClass();
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
        String[] token = next.split("\t");
        for(String element : token){
            //System.out.println( element + " " );
            if(element.equals("n")){ // true
                boolean add = noun.add(next);
                nounOnly.add(token[1]);
                NounCounter++;
                //System.out.println(add);
            }else if(element.equals("v")){ // true
                boolean add = verb.add(next);
                VerbCounter++;
                //System.out.println(add);
            }
        }
        /**
         * Noun collector for collect all of noun from resource file 
         * to box.
         */
         NounBox.nounCollector(token);
        
//      System.out.println(Arrays.toString(token));
//      System.out.println(Arrays.toString(elevationProfile));
//      break;
    }
    //WRITER REALIZE AND MARK UP WORDS
//     System.out.println("\nPrint only NOUN colacation from internal file\n");
//     for(String element : noun){
//         /**
//         * Print only noun form resource data
//         */
//         System.out.println(element);
//    }
     
    System.out.println("\nThis list contains most popular category and producs form food store");
    System.out.println("Remember this is only firs variant of product list.\n");

    List<Double> testResult = new ArrayList<>();
    String fileData = "selectedNoun.dat";
    String dir = CorpusDataClass.class.getResource("/Meta-inf/resources/").getFile();
    OutputStream os = new FileOutputStream(dir + fileData);
      try (PrintStream printStream = new PrintStream(os)) {
          for (String element : nounOnly) {
              /**
               * Print only noun form resource data
               */
              System.out.println(element);
              printStream.println(element);
          }
        printStream.close();
//    System.out.println("Total noun counter: "+  NounCounter); 
//    System.out.println("\nPrint only VERB colacation from internal file \n");
//    for(String element : verb){
//        /**
//        * Print only noun form resource data
//        */
//        System.out.println(element);
//    }
//    System.out.println("Total noun counter: " +  VerbCounter);   
//
//    System.out.println("Noun collection");   
//    System.out.println(NounBox.getCollection());
      }
  }
  /**
   * This method return noun collection after parse file in readDataLemmaPosFormat() method.
   * @return 
   */
  public List<String> getNounCollection(){
      
      return this.nounOnly;
  }
 /**
  * Internal method to read data include Lemma elements and collocates .
  * Collocates are words that occur near a given word (the node word),
  * and they can provide very useful insight into the meaning and usage 
  * of the words near which they occur.
  * @deprecated 
  * @throws FileNotFoundException
  * @throws URISyntaxException 
  */

   public void readDataLemmaColl() throws FileNotFoundException, URISyntaxException {
    URL resource = getClass().getClassLoader().getResource("META-INF/resources/EntriesWithCollocates_non_description.txt");
  //  System.out.println("URL " + resource);
    /**
     * Use a scanner to read in the data line by line
     */
    Scanner s = new Scanner(new File(resource.toURI())); // throws FileNotFoundException, URISyntaxException
    List<String> noun = new ArrayList<>();  
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
        String[] token = next.split("\t");
        //System.out.println( element + " " );
        if(token[2].equals("n")){ // true
            boolean add = noun.add(next);
            //System.out.println(add);
        }
    }
//    System.out.println("\nThis list contains the largest and most accurate lists of collocates of English");
//    System.out.println("Remember that any list of collocates is only as good as the corpus (collection of texts) that it is based on.\n");
    
    List<Double> testResult = new ArrayList<>();
    String fileData = "newNounCollection.dat";
    String dir = CorpusDataClass.class.getResource("/Meta-inf/resources/").getFile();
    OutputStream os = new FileOutputStream(dir + fileData);
      try (PrintStream printStream = new PrintStream(os)) {
          for (String element : noun) {
              /**
               * Print only noun form resource data
               */
           //   System.out.println(element);
              printStream.println(element);
          }
          printStream.close();
        }
  }
    /**
  * Internal method to read datas included category and products from list.
  * @throws FileNotFoundException
  * @throws URISyntaxException 
  */
   public void readDataProductToSetCategory() throws FileNotFoundException, URISyntaxException {
    URL resource = getClass().getClassLoader().getResource("META-INF/resources/ProductsFood.txt");
    System.out.println("URL " + resource);
    /**
     * Use a scanner to read in the data line by line
     */
    Scanner s = new Scanner(new File(resource.toURI())); // throws FileNotFoundException, URISyntaxException
    List<String> products = new ArrayList<>();
    List<String> category = new ArrayList<>();
    
    
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
        String[] token = next.split("-");
        boolean add = false;
          //System.out.println( element + " " );
        if(token[0].equals("food") && token.length < 2 ){ // true
              add = category.add(next);
            //System.out.println(add);
        }else if(token[0].equals("meat") && token.length < 2)
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
    final PrintStream printStream = new PrintStream(os);
     
     
     for(String element : products){
         /**
         * Print only noun form resource data
         */
      //  System.out.println(element);
        printStream.println(element);
         
         
     }
     
    printStream.close();
     
  }
  
}
