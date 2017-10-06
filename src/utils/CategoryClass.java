/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * File for storage category and accordingly subcategory 
 * to recursive search.
 * @author Alex Titov
 * @since 0.0.1 created 27/06/2017
 */
public class CategoryClass {

    public String category;
    public List<String> subcategory;
    public CategoryClass(){
           
        this.subcategory = new ArrayList<>();
    }
    
    public void setCategory(String category){
    
        this.category = category;
    }
    public void setSubcategory(String subcategory){
        
        this.subcategory.add(category);
        this.subcategory.add(subcategory);
    }
    public List<String> getSubcategory(){
    
        return this.subcategory;
    }
     public String getCategory(){
    
        return this.category;
    }
}
