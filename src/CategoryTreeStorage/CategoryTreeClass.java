package CategoryTreeStorage;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Alex Titov  alexeytitovwork@gmail.com
 * @param <T>
 */
public class CategoryTreeClass<T> implements Iterable<CategoryTreeClass<T>> {

    T data;
    CategoryTreeClass<T> parent;
    List<CategoryTreeClass<T>> children;

    public CategoryTreeClass(T data) {
        this.data = data;
        //System.out.println(this.data);
        this.children = new LinkedList<>();
    }

    public CategoryTreeClass<T> addChild(T child) {
        CategoryTreeClass<T> childNode = new CategoryTreeClass<>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    public void getData() {
   
      System.out.println(this.data);
       for(CategoryTreeClass<T> Element: this.children)
            Element.getData();
        
//        
           
    }
    
    // other features ...

    @Override
    public Iterator<CategoryTreeClass<T>> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}